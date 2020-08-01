package day31_Recap;

import Library.Util; //import Util class to reuse methods

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AABBFFOXXXXXXXXLMZZVBCCC"; // A2B3C3

        String expectedResult = "";//store the result of str in this variable A2B3C3

        //remove dup from str and store in this variable
        String nonDup = Util.duplicates(str);
             //call className.methodName(variable)
        System.out.println(nonDup);//prints the char only ONCE

 /*       for(char each : nonDup.toCharArray()){
            int count = Util.frequency(str, each);
            expectedResult += ""+ each + count;
        }
         */
        for(int i = 0; i <= nonDup.length()-1; i++){
            char ch = nonDup.charAt(i); //nonDup string
            int count = Util.frequency(str, ch);//get the frequency
            expectedResult += ""+ch + count;//concat string with its frequency, repeat till end
        }


/*        //will return A
        char ch1 = nonDup.charAt(0);//A
//how will I find the frequency of this ch1, in the string str
        int count = Util.frequency(str, ch1); //2
        expectedResult += ""+ch1 + count;// A2, use the double quote to make it string

        char ch2 = nonDup.charAt(1);//B
//how will I find the frequency of this ch2, in the string str
        int count2 = Util.frequency(str, ch2); //3
        expectedResult += ""+ch2 + count2;// B3, use the double quote to make it string

        char ch3 = nonDup.charAt(2);//C
//how will I find the frequency of this ch3, in the string str
        int count3 = Util.frequency(str, ch3); //3
        expectedResult += ""+ch3 + count3;// C3, use the double quote to make it string

        System.out.println(expectedResult);

 */
        System.out.println(expectedResult);
        System.out.println("===========================================================");

        String str2 = "abcbhgfytewqgfbvvvvvvvvsfsdiyirehyeryn";
        String expectedResult2 = frequencyOfChars(str2);
        System.out.println(expectedResult2);
    }

    public static String frequencyOfChars(String str){
        String expectedResult = "";//store the result of str in this variable A2B3C3
        //remove dup from str and store in this variable
        String nonDup = Util.duplicates(str);
        //call className.methodName(variable)


       for(char each : nonDup.toCharArray()){
            int count = Util.frequency(str, each);
            expectedResult += ""+ each + count;
        }

       return expectedResult;

    }



}
