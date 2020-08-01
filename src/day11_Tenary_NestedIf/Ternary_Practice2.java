package day11_Tenary_NestedIf;

public class Ternary_Practice2 {
    public static void main(String[] args) {

        /*
        write a program that can compare two number
        a = 250, b = 20
        output: a is greater
        a = 30, b = 40
        output: b is greater
        a = 5, b = 5
        output: a is equal to b
         */

        int a = 20;
        int b = 20;
        String result = "";

        if(a > b){
            result = "a is greater";
        }else if(b > a){
            result = "b is greater";
        }else{
            result = "a is equal to b";
        }
        System.out.println("****If Else Way********");
        System.out.println(result);
        System.out.println("*****Ternary Way******");

        String r = (a > b) ? +a+" is greater" : (b > a) ? +b+" is greater" : "a is equal to b";
        System.out.println(r);
        //====================================================================================

        /*
    write a program that can find the number of days in a month
    (Assume that Feb has 28 days)
     HINT:
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12
            Invalid: num < 1 || num > 12
     */
        int month = 15;
        boolean days28 = month == 2;//for the months that has 28 days (feb.) second month
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;//using month that can
        //have 30 days
//        boolean days31 = month == 1 || month == 3 || month == 5 ||
//                month == 7 || month == 8 || month == 10 || month == 12;//month that has 31 days
        boolean inValid = month < 1 || month > 12;
        String result1 = "";


        if(days28){
            result1 = "28 days";
        }else if (days30){
            result1 = "30 days";
        }else if (inValid){
            result1 = "Invalid days";
            ////day28 == false && day30 == false && invalid == false (we can make day31 boolean, but it
            //is easier to use else statement rather than another if else statement
        }else{
            result1 = "31 days";
        }
        System.out.println("******If Else Way******");
        System.out.println(result1);

        String r1 = (days28) ? "28 days" : (days30) ? "30 days" : (inValid) ? "Invalid days"
                : "31 days";
        System.out.println("*****Ternary Way******");
        System.out.println(r1);

        //======================================================================
        /*     1. write a java program that can convert numbers between 0 ~ 9 to words,
     if the number is greater than 9 or less than zero, out put should be "Invalid". */
        int num = 8; //we will use multi branch if statement
        String result2 = ""; //we need to initialize the local variable before we can use it.

        if(num == 0){
            result2 = "zero";//only time this code get executed if condition is true
        }else if(num == 1){
            result2 = "one";
        }else if(num == 2){
            result2 ="two";
        }else if(num == 3){
            result2 = "three";
        }else if(num == 4){
            result2 = "four";
        }else if(num == 5){
            result2 = "five";
        }else if(num == 6){
            result2 = "six";
        }else if(num == 7){
            result2 = "seven";
        }else if(num == 8){
            result2 = "eight";
        }else if (num == 9){
            result2 = "nine";
        }else{
            result2 = "Invalid";
        }
        System.out.println("*****IF ELSE WAY******");
        System.out.println(result2);

        String r2 = (num == 0) ? "Zero" : (num == 1) ? "One" : (num == 2) ? "Two" : (num == 3) ?
                "Three" : (num == 4) ? "Four" : (num == 5) ? "Five" : (num == 6) ? "Six" : (num ==7)?
                "Seven" : (num == 8) ? "Eight" : (num == 9) ? "Nine" : "Invalid";

        System.out.println("*****Ternary Way******");
        System.out.println(r2);



    }
}
