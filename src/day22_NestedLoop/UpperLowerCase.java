package day22_NestedLoop;

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        /*
        1. Write a program that asks user to enter a string.
        If string started with uppercase and ends with lowercase letter then print true,
         otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");

        String word = input.next();

        char ch1 = word.charAt(0); //need to get first char
        char ch2 = word.charAt(word.length()-1);//need to get last char of the string

        boolean startRange = ch1 >= 'A' && ch1 <= 'Z';//uppercase characters
        boolean endRange = ch2 >= 'a'&& ch2 <='z';

        if(startRange && endRange){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
