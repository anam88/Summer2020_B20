package day14_Recap;

import java.util.Scanner;

public class TaxAnnualSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         2. write a program that can calculate the tax based on the annual salary
                    1. ask the user enter the annual salary
                    2. ask user to enter the full name
                    3. ask user enter married status (use nextBoolean() method this time)
                    assume that the normal tax rate for a person is set to 25 %.
                    if he/she is married tax rate will be set to 20%
                    the program should display all the information in teh output
         */
        System.out.println("Enter the annual salary");
        Double annualSalary = input.nextDouble();
        input.nextLine();
        System.out.println("Enter the full name");
        String fullName = input.nextLine();
        System.out.println("Married Status");
        boolean marriedStatus = input.nextBoolean();

        double salaryAfterTax;
        if(marriedStatus==true){
            System.out.println("Enter the tax rate for married people");
            double marriedTaxRate=input.nextDouble();
            double totalTax=annualSalary*(marriedTaxRate)/100;
            salaryAfterTax=annualSalary-totalTax;
        }else{
            System.out.println("Enter the regular tax rate");
            double regularTaxRate=input.nextDouble();
            double totalTax=annualSalary*(regularTaxRate)/100;
            salaryAfterTax=annualSalary-totalTax;
        }
        System.out.println("Full Name is: "+fullName+"\nAnnual Salary is: $"+annualSalary+
               "\nMarried Status is: "+marriedStatus+"\nThe salary after tax: $"+salaryAfterTax);
    }

}//WORKED
