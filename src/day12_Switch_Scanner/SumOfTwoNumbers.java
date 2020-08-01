package day12_Switch_Scanner;

import java.util.Scanner;//import scanner

public class SumOfTwoNumbers {
    /*
write a program that can ask user to enter two number, print the sum of those two numbers
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//declare scanner
        System.out.println("Enter the First Number");

        int n1 = input.nextInt();//assign the primitive type
        System.out.println("Enter the Second Number");
        int n2 = input.nextInt();
        System.out.println("The sum of two numbers");
        int sum = n1 + n2;
        System.out.println(sum);
    }

}
