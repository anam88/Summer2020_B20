package day06_ComparisonOperators;

public class SalaryCalculator {
    /* task04:
            Create a class called SalaryCalculator, write a program that can calculate the tax,
            and salary after tax based on the hourly rate & tax rates
                ex:
                    if: rate = 55;
                        stateTaxRate = 0.04;
                        federalTaxRate =0.22;
                        weeklyHours = 40;
                    then output will be:
                            your salary is: 105600 USD
                            your total tax is: 27456 USD
                            your income after tax is: 78144 USD
                Assume that a year has 48 weeks (excluding PTO)
 */
    public static void main(String[] args) {
        double hourlyRate = 70;
//        int weeks = 48;
        int weeklyHours = 40;
        double stateTaxRate =  0.04;
        double federalTaxRate = 0.22;
        //calculate the total salary
        double salaryIs = hourlyRate * weeklyHours * 48;
        //calculate the total tax
        double tax = stateTaxRate + federalTaxRate;
        double totalTax = (salaryIs * tax);
        //income after tas is
        double salaryAfterTax = salaryIs - totalTax;



        System.out.println("Your salary before tax is: "+ salaryIs+" "+"USD");
        System.out.println("Your total tax is: "+totalTax+" "+"USD");
        System.out.println("Take home salary is: "+salaryAfterTax+" "+"USD");




    }
}
