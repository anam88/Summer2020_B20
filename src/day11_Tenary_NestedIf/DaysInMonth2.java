package day11_Tenary_NestedIf;

public class DaysInMonth2 {
     /*
    write a program that can find the number of days in a month
    (Assume that Feb has 28 days)
     HINT:
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12
            Invalid: num < 1 || num > 12
            USE: NESTED IF
     */
     public static void main(String[] args) {

         int month = 10;
         boolean validNumber = month >= 1 && month <= 12;
         String result = "";
         boolean days28 = month == 2;//for the months that has 28 days (feb.) second month
         boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;//using month that can
         //have 30 days
//        boolean days31 = month == 1 || month == 3 || month == 5 ||
//                month == 7 || month == 8 || month == 10 || month == 12;//month that has 31 days
         boolean inValid = month < 1 || month > 12;

         if(validNumber){
             if(days28){
                 result = "28 days";
             }else if(days30){
                 result = "30 days";
             }else{
                 result = "31 Days";
             }
         }else{//in valid month-line 37 will execute if line 26 is false
             result = "Not Valid";
         }

         System.out.println(result);



     }
}
