package day09_IfStatement;

public class MinNumber {
     /* 2. write a java program that accepts three numbers and return the minimum number
            (assume that none of them are equal)*/
     public static void main(String[] args) {
         int num1 = 100;
         int num2 = -5;
         int num3 = 250;

         int min = 0;

         if (num1 < num2 && num1 < num3) {
//             System.out.println(num1 + " is the minimum number");
             min = num1;
         }
         if (num2 < num1 && num2 < num3) {
//             System.out.println(num2 + " is the minimum number");
             min = num2;
         }
         if (num3 < num1 && num3 < num2) {
//             System.out.println(num3 + " is the minimum number");
             min = num3;
         }
         System.out.println(min+" is the minimum number.");
     }
}


