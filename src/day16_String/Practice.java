package day16_String;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          /*task: ask user if he/she is employeed
    if the user says yes, print "employeed"
    otherwise ==> unemployed
     */
        System.out.println("Are you employeed?");
        String answer = input.next();

        if(answer.equalsIgnoreCase("yes")){//use this method so it ignores the case sensitivity
            System.out.println("Employeed");
        }else{
            System.out.println("Not employeed");
        }
    }
}
