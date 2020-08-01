package day29_CustomMethods;

import java.util.Scanner;

public class Palindrome {
    /*
     9. write a method that can check if a string is palindrome,
      print true if it's  otherwise print false

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        palindrome(input.next());

    }
    public static void palindrome(String str){
        String reverseStr = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            reverseStr += str.charAt(i);
        }
        if(str.equalsIgnoreCase(reverseStr)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
