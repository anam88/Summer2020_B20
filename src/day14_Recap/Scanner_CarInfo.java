package day14_Recap;

import java.util.Scanner;

public class Scanner_CarInfo {
    /*
      1. write a program that asks the user enter his car info:
                            brand
                            model
                            year
                            color
                            mileage
                            price
                ex: output format should be:
                      2012 Toyota Corolla white, 120000 miles, 12000 dollars

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the car year:");
        int year = input.nextInt();
        System.out.println("Enter the car brand:");
        String brand = input.next();
        System.out.println("Enter the car model");
        String model = input.next();
        System.out.println("Enter the car color:");
        String color = input.next();
        System.out.println("Enter the car mileage:");
        int miles = input.nextInt();
        System.out.println("Enter the car price:");
        int price = input.nextInt();

        System.out.println(year+" "+brand+" "+model+" "+color+", "+miles+" miles, "+price+" dollars");







    }//worked
}
