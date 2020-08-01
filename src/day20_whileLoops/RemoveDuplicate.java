package day20_whileLoops;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        /*
        write a program that can remove the duplicates from any given string
        ex: input: abcabcaabb
        output: abc
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = input.next(); //remove duplicates


        String result = "";

        for(int i = 0; i <= str.length()-1; i++){
            /*starting point is 0 because index start from 0
        ending point we are using length method because we don't know the length of string
        increment because indexes are increasing by 1 point
         */
            String s = ""+str.charAt(i);
        /*using charAt method to get the index, charAt method return int. therefore did the concating
        so it returns the string and assign it to the string s.
         */
            if(!result.contains(s)){/*if the character already contain in the result,
            it will not be concat to the result
                */
                result += s;
            }
        }
        System.out.println(result);


    }
}
