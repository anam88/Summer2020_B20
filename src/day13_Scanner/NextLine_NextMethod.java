package day13_Scanner;

import java.util.Scanner;

public class NextLine_NextMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //program to write me a salary and full name

//        System.out.println("Enter your salary: ");
//        Double salary = input.nextDouble(); //120000
//        input.nextLine();//will take out the enter and will execute next nextLine properly
//        //no variable assign to line 12 because we will not be re-using it.
//        System.out.println("Enter employee full name");
//        String fullName = input.nextLine();//it will take everything that is left in scanner memory
//
//        System.out.println("The full name is: "+fullName+"\nThe salary is: "+"$"+salary);

        //write a program that prints the address using nextLine()
//write a program that prints the building number and street name using nextLine method
        System.out.println("Enter the building number: ");
        int building = input.nextInt();
        input.nextLine();
        System.out.println("Enter the street name: ");
        String streetName = input.nextLine();

        System.out.println("The address is: "+building+" "+streetName);
    }
}
