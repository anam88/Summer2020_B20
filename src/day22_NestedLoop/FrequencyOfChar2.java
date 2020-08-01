package day22_NestedLoop;

import java.util.Scanner;

public class FrequencyOfChar2 {
    public static void main(String[] args) {
/*
3. write a program that can return the frequency of every single characters from the string:
ex:
    str1 = "aabbccaa";
    output: a4b2c2
    HINT:
easier approach:
        1. remove duplicates ==> str2 = "abc"
        2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
        3. result: a4b2c2
previous section we leaned how to find the frequency of one character.
you will need to repeat the same steps
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = input.next(); //A2 | B2
//let's first remove the duplicate
        String nonDuplicates = ""; //AB
        String result = ""; //at the end we will assign result A2B2 to this variable

//we have to check every single character of the str to check for duplicates
        for(int i = 0; i <= str.length()-1; i++){
           String ch1 =  ""+str.charAt(i);//A, B, A, B

            if(!nonDuplicates.contains(ch1)){
                nonDuplicates += ch1;//if the string does not character and it is true so the character
                //concat with the ch1
            }
        }
        System.out.println(nonDuplicates);
        //now find out how many times does the single character occurs in a string
        //str = "ABAB"    nonDuplicates = "AB"

       for(int j = 0; j <= nonDuplicates.length()-1; j++){
           char ch1 = nonDuplicates.charAt(j); //how many times A occur in the original String
           int count = 0;//number of times A occur it will add to count

           for(int i = 0; i <= str.length()-1; i++){
               if(str.charAt(i) == ch1){
                   //if each character of string matches ch1, than I should count it
                   count++;
               }
           }
           result += ""+ ch1 + count;
        }
       System.out.println("Character + Frequency in the string: "+result);
    }
}
