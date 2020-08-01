package day13_Scanner;

import java.util.Scanner;

public class SalaryAfterTax {
    /*
     5. write a program that can calculate the state tax, federal tax and salary after tax
                needed information:
                                annual salary
                                state tax rate
                                federal tax rate
                MUST use Scanner

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your annual salary amount:");
        double annualSalary = input.nextDouble();//150000
        System.out.println("Enter your state tax rate:");
        double stateTaxRate = input.nextDouble();//0.05 | 5%
        System.out.println("Enter your federal tax rate:");
        double federalTaxRate = input.nextDouble(); //0.02 | 2%

        double stateTax = annualSalary * stateTaxRate;
        double federalTax = annualSalary * federalTaxRate;

        double salaryAfterTax = annualSalary - (stateTax + federalTax);
        System.out.println("Your state tax rate is: "+"$"+stateTax+"" +
                "\nYour federal tax rate is: "+"$"+ federalTax+"" +
                "\nYour annual salary after tax is: "+"$"+salaryAfterTax);
    }
}
