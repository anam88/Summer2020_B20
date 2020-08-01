package day14_Recap;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        4. Write a program that asks user to enter the month number and
         returns the number of days in given month month (Assume that Feb has 28 days)
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12

                MUST use Scanner and nested IF

         */
        System.out.println("Enter the month number");
        int month = input.nextInt();
        String message = "";
        boolean validNumber = month >= 1 && month <= 12;
        boolean days28 = month == 2;//for the months that has 28 days (feb.) second month
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;//using month that can
        //have 30 days
//        boolean days31 = month == 1 || month == 3 || month == 5 ||
//                month == 7 || month == 8 || month == 10 || month == 12;//month that has 31 days
        boolean inValid = month < 1 || month > 12;

        if(validNumber){
            if(days28){
                message = "28 days";
            }else if(days30){
                message = "30 days";
            }else{
                message = "31 Days";
            }
        }else{//in valid month-line 37 will execute if line 26 is false
            message = "Not Valid";
        }
        System.out.println(message);
    }
}
//WORKED