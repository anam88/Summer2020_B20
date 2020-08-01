package day03_sequences_Variables;
////write a program that can calculate salary after tax
//        //variable: salary, tax
//        //totalTax = salary * tax;
//        //salaryAfterTax = salary - totalTax
public class SalaryCalculator {

    public static void main(String[] args) {

        int salary = 150000;
        double tax = 0.28;
        //calculate the total tax
        double totalTax = salary * tax;
        System.out.println("The Total Tax paid " + totalTax);
        //calculate the total salary after tax
        double salaryAfterTax = salary - totalTax;
        System.out.println("The Total Salary after tax is " + salaryAfterTax);


    }



}
