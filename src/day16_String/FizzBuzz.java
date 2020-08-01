package day16_String;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        1. Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check
    if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"
        NOTE: you will need nested If

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();

        boolean result = word1.length()== 5 && word2.length() == 5;
        String message = "";
//first approach
        if(result == true){//if this pre - statement is true --Nested if will get execute
            char ch1 = word1.charAt(word1.length()-1);//will return last character of first word
            char ch2 = word2.charAt(0);//will return last character of second word
            if(ch1 == ch2){
                message = "Fizz";
            }else{
                message = "Buzz";
            }
        }else{//means result == false
            message = "need to be exactly 5 chars length";

        }

    //second approach
    /*    if(result){
            if(word1.endsWith(""+word2.charAt(0)) &&
                    word2.startsWith(""+word1.charAt(word1.length()-1))){
                message = "Fizz";
            }else{
                message = "Buzz";
            }

        }else{
            message = "need to be exactly 5 chars length";
        }

     */
        System.out.println(message);
        System.out.println("**************************");
/*
2. ask the user to enter a word.
        if the word ends with "ly", print "really???"
        otherwise, print "never mind"

 */
        System.out.println("Enter a word");
        String w1 = input.next();

        boolean ly = w1.endsWith("ly");
        if(ly == true){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }

    }
}
