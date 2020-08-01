package day31_Recap;

import java.util.Scanner;

public class Method_Practice1 {
/*
create a method that can reverse s String
identify if a String is palindrome
 */
    public static void main(String[] args) {
    //let's reverse the string by assigning it to new variable to we can re-use it
        Scanner input = new Scanner(System.in);
        String name = "Hello";
        System.out.println(revStr(name)); //return the reverse string
        String revStr1 = revStr(name);
        System.out.println(name.equalsIgnoreCase(revStr(name)));
        //return the boolean value if the string is palindrome or not
}

    //use return type method to reverse a string
    public static String revStr(String str){

        String result = "";//to store the reverse order
        for(int i = str.length()-1; i >= 0; i--){
           result += str.charAt(i);
        }
        return result;
    }
}
