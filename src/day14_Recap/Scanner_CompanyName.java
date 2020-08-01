package day14_Recap;
import java.util.Scanner;

public class Scanner_CompanyName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        2. write a program that asks the user enter the:
                    1. company name
                    2. first name
                    3. last name
                    4. Job title
                    5. salary

         */
        System.out.println("Enter the company name: ");
        String companyName = input.nextLine();
//        input.nextLine();
        System.out.println("Enter the first name: ");
        String f_name = input.next();
        System.out.println("Enter the last name:");
        String l_name = input.next();
        System.out.println("Enter the job title: ");
        String jobTitle = input.next();
        System.out.println("Enter the salary: ");
        double salary = input.nextDouble();

        System.out.println("Company Name is: "+companyName+"\nEmployee full name is: "+f_name+" "+l_name+"\nEmployee job title is: "+jobTitle+
                "\nEmployee annual salary is: "+"$"+salary);

    }
}//WORKED
