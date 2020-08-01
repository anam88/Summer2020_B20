package day11_Tenary_NestedIf;

public class NumberOfDays {
    /*
    write a program that can find the number of days in a month
    (Assume that Feb has 28 days)
     HINT:
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12
            Invalid: num < 1 || num > 12
     */
    public static void main(String[] args) {
        int month = 3;
        boolean days28 = month == 2;//for the months that has 28 days (feb.) second month
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;//using month that can
        //have 30 days
//        boolean days31 = month == 1 || month == 3 || month == 5 ||
//                month == 7 || month == 8 || month == 10 || month == 12;//month that has 31 days
        boolean inValid = month < 1 || month > 12;
        String result = "";

        if(days28){
            result = "28 days";
        }else if (days30){
            result = "30 days";
        }else if (inValid){
            result = "Invalid days";
            ////day28 == false && day30 == false && invalid == false (we can make day31 boolean, but it
            //is easier to use else statement rather than another if else statement
        }else{
            result = "31 days";
        }
        System.out.println(result);

    }
}
