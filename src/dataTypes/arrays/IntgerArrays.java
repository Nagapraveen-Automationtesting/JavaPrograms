package dataTypes.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntgerArrays {

    /**
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     * Notice that the solution set must not contain duplicate triplets.
     * Input numArr = [1, 0, -1, 2, -1, 1]
     * Output = [[-1, 0, 1], [-1, -1, 2]]
     * <p>
     * Input numArr = [1,0,2]
     * Output = []
     * <p>
     * Input numArr = [0,0,0]
     * Output = [[0,0,0]]
     *
     * @return
     */
    public static Integer[][] getThreeNumberCombinationArrayWithSumOfZero(Integer[] numArr) {
        List<Integer[]> resArr = new ArrayList<>();
        boolean first = false;
        if (numArr.length < 3) {
            System.out.println("Inavalid input !!!!!!!!!!!!!!!!!!!!!!!!!!");
        } else if (numArr.length == 3) {
            if (numArr[0] + numArr[1] + numArr[2] == 0) {
                resArr.add(numArr);
            }
        } else {
            for (int i = 0; i < numArr.length - 3; i++) {
                for (int j = i + 1; j < numArr.length - 2; j++) {
                    for (int k = j + 1; k < numArr.length - 1; k++) {
                        int size = resArr.size();
                        if (numArr[i] + numArr[j] + numArr[k] == 0) {
                            Integer[] tempArray = {numArr[i], numArr[j], numArr[k]};
                            Arrays.sort(tempArray);
                            if (first) {
                                for (int l = 0; l < size; l++) {
                                    Arrays.sort(resArr.get(l));
                                    if (tempArray[0] == resArr.get(l)[0] && tempArray[1] == resArr.get(l)[1] && tempArray[2] == resArr.get(l)[2]) {
                                        System.out.println("Duplicate triplet!!!!!!!!!!!!!!!!!!!!!" + Arrays.asList(resArr.get(l)));
                                    } else {
                                        resArr.add(tempArray);
                                    }
                                }
                            } else {
                                resArr.add(tempArray);
                                first = true;
                            }
                        }
                    }
                }
            }
        }
        int i = 1;
        System.out.println("Results for given array : " + Arrays.asList(numArr));
        for (Integer[] eACH : resArr) {
            System.out.println(i + ") " + Arrays.asList(eACH));
            i++;
        }
        Integer[][] result = resArr.toArray(Integer[][]::new);
        return result;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 0, -1, 2, -1, 1};
        Integer[] arr2 = {1, 0, 2};
        Integer[] arr3 = {0, 0, 0};

        getThreeNumberCombinationArrayWithSumOfZero(arr1);
        getThreeNumberCombinationArrayWithSumOfZero(arr2);
        getThreeNumberCombinationArrayWithSumOfZero(arr3);

    }
}
