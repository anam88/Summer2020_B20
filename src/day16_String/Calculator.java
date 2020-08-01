package day16_String;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

         /*
    write a program to ask use to enter two number and a math operator.
     ex: 10
         20
         *
         output: 200
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first num");
        Double num1 = input.nextDouble();
        System.out.println("Enter second num");
        double num2 = input.nextDouble();
        System.out.println("Enter a math operator");
        char operator = input.next().charAt(0);//will return char

        boolean valid = operator == '*' || operator == '/' ||  operator == '%' || operator
                == '+' || operator == '-';
        if(valid){//switch statement inside if statement
            switch (operator){
                case '*':
                    System.out.println(num1 * num2);
                break;
                case '/':
                    System.out.println(num1/ num2);
                    break;
                case '%':
                    System.out.println(num1 % num2);
                    break;
                case '+':
                    System.out.println(num1 + num2);
                    break;
                default:
                    System.out.println(num1 - num2);
                    break;
            }
        }else{
            System.out.println("invalid operator");
        }


    }
}
