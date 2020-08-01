package day20_whileLoops;

import java.util.Scanner;

public class FactorialNumber {
    /*
    4. Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120
            The factorial of a number is the product of all the integers from 1 to that number.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int result = 1;

    //for(int i = 5; i >= 1; i--)//without string
        for (int i = n; i >= 1; i--){//i: 5 4 3 2 1
            result *= i;//5 * 4 * 3 * 2 * 1 =120
        }
        System.out.println(result);
    }

}
