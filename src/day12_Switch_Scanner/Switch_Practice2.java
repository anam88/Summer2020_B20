package day12_Switch_Scanner;

public class Switch_Practice2 {
    public static void main(String[] args) {
//create a switch statement that print out the name of company
        String productName = "iPhone";

        switch (productName){//datatype = String

            case "Galaxy":
                System.out.println("Samsung");
                break;

            case "iPhone": //applying OR logic| company name is Apple and iphone and macbook both
                // are apple product; therefore both will execute
            case "MacBook":
            case "iPod":
                System.out.println("Apple");
                break;

            default:
                System.out.println("Invalid product");
                break;
        }
        System.out.println("***********************************");

    /*
    write a program that can find the number of days in a month
    (Assume that Feb has 28 days)
     HINT:
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12
            Invalid: num < 1 || num > 12
            USE: Switch Statement
     */

        int month = 13;
        String result = "";

        switch (month){

            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 days";
                break;
            case 2:
                result = "28 days";
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 days";
                break;

            default:
                result = "Invalid Number of Month";
                break;
        }
        System.out.println(result);
    }
}
