package day29_CustomMethods;

import java.util.Scanner;

public class AgeOfUser {
    //create a method that can calculate the age of person
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter birth year and current year");
        age(input.nextInt(), input.nextInt());
    }

    public static void age(int birthYear, int currentYear ){
        if(currentYear < birthYear){
            System.out.println("Invalid entry");;
        }else{
            int age = currentYear - birthYear;
            System.out.println("The age of the user is: "+age);
        }

    }
}
