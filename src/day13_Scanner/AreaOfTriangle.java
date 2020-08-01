package day13_Scanner;

import java.util.Scanner;

public class AreaOfTriangle {
    /*
    2. write a program that calculate the area of any given rectangle
                MUST use scanner
                formula area of triangle = 1/2 * (base * height)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of base:");
        int base = input.nextInt();
        System.out.println("Enter the value of height:");
        int height = input.nextInt();

        double areaOfTriangle = 0.5 * (base * height);
        System.out.println("The area of Triangle is: "+areaOfTriangle);

    }
}
