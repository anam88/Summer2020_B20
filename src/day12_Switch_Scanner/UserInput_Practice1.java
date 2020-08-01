package day12_Switch_Scanner;


import java.util.Scanner; //import Scanner

//import java.util.Scanner;
//
public class UserInput_Practice1 {

    public static void main(String[] args) {

//        /*
//        write a program that can ask user to enter a number if the number is ODD number print: "odd number"
//        otherwise, print: "Even"
//         */
       Scanner input = new Scanner(System.in);//memorize it
        System.out.println("Enter your number");

        double n1 = input.nextDouble(); //scanner class methods
        //ternary statement
        String result = (n1 % 2 == 0) ? +n1+ " is Even number" : +n1+ " is Odd number";
        System.out.println(result);



    }

}
