package day17_StringReview;

import java.util.Scanner;

public class WarmUpTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input: xcode | Output:code
     */
        System.out.println("****Task1******");
        System.out.println("Enter a word:");
        String word = input.next();
        word =  word.substring(1);
        System.out.println(word);
/*
2. Ask user to enter a word. If the first or second or both letter of the word is x,
print the word without x(s). If x is the third letter it should be printed.
 If the first and second are x, both should be ignored.
*/
        System.out.println("****Task2******");
        System.out.println("Enter a word:");


    }
}
