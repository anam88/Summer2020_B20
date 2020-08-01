package day19_ForLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         1. write a program that can reverse any string

         */
        String str = "Cyber"; //reverse it rebyC
        //            01234
        String result = ""+str.charAt(str.length()-1) + str.charAt(3) +
                str.charAt(2)+ str.charAt(1) + str.charAt(0);//concat it to make it string

        System.out.println("The reverse version of Cyber is: "+result);

        System.out.println("**************************");

        //using loop to reverse a string
        System.out.println("Enter a String");
        String str1 = input.nextLine();
        String message = "";

        for(int i = str1.length()-1; i >= 0; i-- ){
            message += str1.charAt(i); //+ sign here doing concatenation
        }
        System.out.println("The reverse of entered String is: "+message);

    }
}
