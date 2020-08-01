package day16_String;

import java.util.Scanner;

public class TwoStringsEqual {
    public static void main(String[] args) {
        /*
        write a program that check if two strings are equal or not
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();
//        String message = "";

//        if(word1.equals(word2)){
//            message = "Words are equal";
//        }else{
//            message = "Words are NOT equal";
//        }

        String message = (word1.equalsIgnoreCase(word2)) ? "Words are equal" : "Words are NOT equal";
        System.out.println(message);




    }
}
