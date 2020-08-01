package day12_Switch_Scanner;

import java.util.Scanner;

public class RateCalculator {

    /*3. write a program for the rate calculator
            1. asks the user to enter the salary (as double)
            2. ask the user how many hours does he/she works in a week
            3. print the hourly rate of the employee
            formula: hourRate = salary /(weeklyHour * 52)
    assume that one year has 52 weeks */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary");
        double salary = input.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int weeklyHour = input.nextInt();
        int totalHours = weeklyHour * 52;

        double hourRate = salary / totalHours;
        System.out.println("Your hourly rate is: "+"$"+hourRate);


    }
}
