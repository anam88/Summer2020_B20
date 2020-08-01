package day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(1988, 1,9 );
        System.out.println(birthDate);
        System.out.println("=====================");

        LocalDate rightNow = LocalDate.now();
        System.out.println(rightNow);
        System.out.println("=====================");

        LocalDate y = LocalDate.of(2019, 1 ,1);
        boolean result = y.isLeapYear();
        System.out.println(result);
        System.out.println("=====================");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();
        boolean result2 = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(result2);

        System.out.println("=====================");

        System.out.println("Enter birth year, month, day");
        LocalDate d = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt() );
        System.out.println(d);

        System.out.println("=====================");




    }
}
