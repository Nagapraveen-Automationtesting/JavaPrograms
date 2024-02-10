package dataTypes.strings;

public class ReverseString {

    /**
     * WAP to reverse each character in a word and preserve words order in a given string
     */
    public static String reverseEachCharacterInEachWord(String inputStr){
        System.out.println("Input String is    : " + inputStr);
        String strRev = "";
        String[] strArr = inputStr.split(" ");
        for(String strEach:strArr){
            String strTemp = "";
            for(int i=strEach.length()-1;i>=0;i--){
                strTemp = strTemp + strEach.charAt(i);
            }
            strRev = strRev + strTemp + " " ;
        }
        System.out.println("Reverse String is  : " + strRev);
        return strRev;
    }



    public static void main(String[] args) {
        reverseEachCharacterInEachWord("Hello world am Praveen");
    }
}
