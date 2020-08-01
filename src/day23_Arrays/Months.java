package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        String monthName[] = {"Jan", "Feb", "Mar", "Apr", "May","June","July", "August",
                               "Sept", "Oct", "Nov", "Dec"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 12");
        int n = input.nextInt();
        System.out.println(monthName[n-1]);





    }
}
