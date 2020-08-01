package day13_Scanner;

import java.util.Scanner;
 /*
        write a program that can calculate the area of any given circle
                MUST use Scanner
                formula to find the area of circle is  A= pi * r^{2}
                pi = 3.14
                r = radius * radius
         */

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of radius");
        int r = input.nextInt(); // 6 * 6 = 36
        System.out.println("Enter the value of pi");
        double pi = input.nextDouble(); //3.14
        double area = pi * r;
        System.out.println("The area of circle is: "+area);
    }
}
