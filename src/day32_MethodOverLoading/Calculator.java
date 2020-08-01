package day32_MethodOverLoading;

import java.util.Scanner;

public class Calculator {
/*
 2. write a return method that accepts two numbers and an operator,
 then returns calculation result.
         if the operator is invalid, return zero
         otherwise return the result

 */
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first num");
    Double num1 = input.nextDouble();
    System.out.println("Enter a math operator");
    char operator = input.next().charAt(0);//will return char
    System.out.println("Enter second num");
    double num2 = input.nextDouble();

    double result = calculator(num1,  operator, num2);
    System.out.println(result);


  /*  if(operator == '*'){
        System.out.println(num1 * num2);
    }else if(operator == '/'){
        System.out.println(num1 / num2);
    }else if(operator == '%'){
        System.out.println(num1 % num2);
    }else if(operator == '+'){
        System.out.println(num1 + num2);
    }else if(operator == '-'){
        System.out.println(num1 - num2);
    }else{
        System.out.println(0);
    }

   */

}
    public static double calculator(double num1, char operator, double num2){

        double result = (operator == '*') ? (num1 * num2) : (operator == '/') ? (num1 / num2) :
                (operator == '%') ? (num1 % num2) : (operator == '+') ? (num1 + num2)
                        : (operator == '-') ? (num1 - num2) : 0;
        return result;
    }

}
