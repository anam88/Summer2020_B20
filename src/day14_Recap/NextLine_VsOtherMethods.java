package day14_Recap;

import java.util.Scanner;
//Scanner inLine Method
public class NextLine_VsOtherMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("Enter your age");
        int age = input.nextInt();//19enter
        input.nextLine();//goes before the nextLine method which is assign to a variable
        System.out.println("Enter company name");
        String companyName = input.nextLine();



        System.out.println("Full name is: "+fullName+" and age is: "+age+" company name is:"+companyName);


    }
}
