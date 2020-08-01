package day20_whileLoops;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        /*
        3. Write a program that calculates the sum of numbers entered by
         the user until user enters a negative number.
            hint: you need an infinite loop

         */
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i == 0;){//if there is no iteration, it will always be true, and it will be
            //infinite loop
            System.out.println("Enter a number: ");//asking user to enter a number
            int num = input.nextInt();//scanner method to enter int

        //giving condition to check if num is +ve OR -ve by using if statement
            if(num < 0 ){//if the num is negative exit the loop
                break;
            }
            sum += num;
        }
        System.out.println("sum is: "+sum);
    }
}
