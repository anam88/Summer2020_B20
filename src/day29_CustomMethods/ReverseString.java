package day29_CustomMethods;

import java.util.Scanner;

public class ReverseString {
    /*
     7. create a method that can reverse any String

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        reverse(input.nextLine());
    }

    public static void reverse(String str){
        char[] ch = str.toCharArray();
        for (int i = ch.length-1; i >= 0; i--){
            System.out.print(ch[i]);
        }

    }
}
