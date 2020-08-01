package day17_StringReview;
import java.util.Scanner;
public class PrintInitials {
    public static void main(String[] args) {
        /*
        4. write a program that asks user's first and last name,
        then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String fName = input.next();
        System.out.println("Enter last name");
        String lName = input.next();
        input.close();
//       String initial =  fName.substring(0,1) +"."+ lName.substring(0,1);
//        System.out.println(initial);
        ////////use charAt Method
        char ch1 = fName.charAt(0); //return char data type
        char ch2 = lName.charAt(0);
        String initials = ch1+"."+ch2;
    //    System.out.println(ch1+ch2);if we execute this step it will do addition
    //that is why we did step on line 28 to assign the data type string to char object so we can
        //get result as an String
        System.out.println(initials);



    }
}
