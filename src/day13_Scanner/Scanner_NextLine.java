package day13_Scanner;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //write a task to enter employee full name, company name, gender

        System.out.println("Enter employee full name: ");
        String fullName = input.nextLine();
        System.out.println("Enter the company name: ");
        String companyName = input.nextLine();

        System.out.println("The employee name is: "+fullName+" " +
                "\nThe company name is: "+companyName);
    }
}
