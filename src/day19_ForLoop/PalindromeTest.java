package day19_ForLoop;

import java.util.Scanner;

/*
Palindrome Test -if string is palindrome print True else False
 */
public class PalindromeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String reverseStr = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            reverseStr += str.charAt(i); //+ sign here doing concatenation
            //another way to reverse string is to use substring
//            reverseStr += str.substring(i, i+1);//give beg and ending index
        }
        System.out.println(""+reverseStr);
        System.out.println(str.equalsIgnoreCase(reverseStr));
    }
}
