package day21_loops;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        3. write a program that can divide two numbers without using
        / & % operators and returns the division and remainder
            ex:
                input:  10
                        3
                output: 3 with a remainder of 1
                ======
                10 - 3 = 7
                7 - 3 = 4
                4 - 3 = 1
         */
        System.out.print("Enter a numerator: ");
        int a = input.nextInt();
        System.out.print("Enter a denominator: ");
        int b = input.nextInt();
//        int a = 10;
//        int b = 3;

        if(b == 0){//denominator can NEVER be 0, therefore we apply this condition so exit the JVM
            System.out.println("Invalid Input");
            System.exit(0);
        }

        int count = 0;//every time a loop is executed add 1 to the count
        //count used for how many times we subtracted denominator from numerator

        while(a >= b){
            a -=b;
            count++;

        }
        System.out.println(count+" with a remainder of "+a);
    }
}
