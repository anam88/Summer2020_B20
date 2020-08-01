package day21_loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        /*
         1. write a program that asks user to enter 5 numbers and returns the maximum number
         */
        //repeated task ask user to enter a number 5 times
        Scanner input = new Scanner(System.in);
        int maxValue = Integer.MIN_VALUE;
        /*
        Integer.MIN_VALUE is a constant in the Integer class of java.lang package that
        specifies that stores the maximum possible value for any integer variable in Java.
         */
        /*declare variable outside the loop because we will only be using it once
        /using for loop because we know the times we need to execution*/
        for(int i = 10; i <= 50; i+=10){
            System.out.print("Enter a number: ");
            int n1 = input.nextInt();

            if(n1 > maxValue){//if this condition becomes true, it will be assigned to n1
                maxValue = n1;

            }
        }
        System.out.println("Max number is: "+maxValue);
    }
}
