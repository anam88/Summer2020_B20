package day13_Scanner;

import java.util.Scanner;

public class NextMethod_Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //next(): design it for String input
        System.out.println("Enter your company name: ");
        String companyName = input.next();
        System.out.println("Your company name is: "+companyName);//will only output the first word(
        //first letter to the space)


        //write a program that will print first and last name using next method
        System.out.println("Enter your first name: ");
        String f_name = input.next();
        System.out.println("Enter your last name: ");
        String l_name = input.next();

        System.out.println(f_name+" "+l_name);
        //only use next method for entering ONE word
    }
}
