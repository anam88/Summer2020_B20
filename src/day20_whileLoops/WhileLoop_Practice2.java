package day20_whileLoops;

import java.util.Scanner;

public class WhileLoop_Practice2 {
    /*
    Write a program that asks user to enter his/her username and password until user enters
correctly.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pwd = "Hello123";

        System.out.println("Enter your password");
        String inputPwd = input.nextLine();

//        if(!input.equals(pwd)){
////            System.out.println("Please enter correct password");
////            inputPwd = input.nextLine();
////        }
        while(!inputPwd.equals(pwd)){
            System.out.println("Please enter correct password");
            inputPwd = input.nextLine();
        }
        System.out.println("Logged in");

    }
}
