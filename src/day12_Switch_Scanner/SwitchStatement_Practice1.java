package day12_Switch_Scanner;

public class SwitchStatement_Practice1 {
    /*
    write a program to display days
    1 - monday
    2 - tuesday
    3 - wednesday
    4 - thursday
    5- friday
    6 - saturday
    7- sunday
     */

    public static void main(String[] args) {

        int day = 5; //day = variable
        String result = "";//by assigning variable we can re-use it later on


        switch(day){ //day-pass the variable in the switch statement
            case 1:
                result = "Monday"; //System.out.println("Monday");
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";//if there is no break statement, compiler first will run
                //the matching case and than all the cases after it until it reaches the end of the block
                //switch statement
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid Days";
                break;
        }
        /*
        write a program that can print out the name of the month based on the number
         */
        int month = 5;
        String r = "";
        switch (month){
            case 1:
                result = "Jan";
                break;
            case 2:
                result = "Feb";
                break;
            case 3:
                result = "Mar";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "Sept";
                break;
            case 10:
                result = "Oct";
                break;
            case 11:
                result = "Nov";
                break;
            case 12:
                result = "Dec";
                break;
            default:
                result = "Invalid Month";
                break;
        }

    }
}
