package day29_CustomMethods;

import java.util.Scanner;

public class Calculator {
/*
given two number and a operator print the outcome
 */
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the num1, operator, and num2");
         calculator(input.nextDouble(), input.next().charAt(0),input.nextDouble() );

 }
    public static void calculator(double num1, char operator, double num2){
        switch(operator){
            case '+':
                System.out.println("Addition: "+(num1 + num2));
                break;
            case '-':
                System.out.println("Subtract: "+(num1 - num2));
                break;
            case '*':
                System.out.println("Multiply: "+(num1 * num2));
                break;
            case '/':
                System.out.println("Divide: "+(num1 + num2));
                break;
            case '%':
                System.out.println("Reminder is: "+(num1 + num2));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
