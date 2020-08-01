package day16_String;

import java.util.Scanner;

public class SubStringMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         1. Ask user to enter two words. Print first word without its
         first character then print the second word without its first character.
                Input:
                    apple
                    orange
                Output:
                    pplerange

         */
        System.out.println("Enter two words");
        String word1 = input.next();
        String word2 = input.next();

        String word3 = word1.substring(1,5);
        String word4 = word2.substring(1,6);

        String twoWords = word3.concat(word4);

        System.out.println(twoWords);
        System.out.println("****************************");

        /*
        2. Ask user to enter a word. Print true is the first and last
        characters of the string are same characters, print false otherwise.
            Input:
                Abba
            Output:
                false
         */
        System.out.println("Enter a word");
        String str1 = input.next();

        char fLetter = str1.charAt(0);
        char lLetter = str1.charAt(str1.length()-1);
        boolean result = true;


        if(fLetter == lLetter){
            result = true;
        }else{
            result = false;
        }
        System.out.println(result);
        System.out.println("****************************");



    }



}
