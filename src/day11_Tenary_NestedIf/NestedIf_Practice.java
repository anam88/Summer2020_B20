package day11_Tenary_NestedIf;

public class NestedIf_Practice {
    public static void main(String[] args) {
         /*
        pre-condition: minimum salary of 30k- MUST
            sub-condition: minimum 2 year of job history

         */

        double salary = 20000;
        int jobHistory = 3;
        String result1 = "";

        if (salary >= 30000){//if this statement is TRUE //than compiler will run nested if statement line 18
            //if line 18 is true, than line 19 will execute

            if(jobHistory >= 2){
                result1 = "You are eligible for Loan";
            }else{//job history is less than two. Line 20 will execute
                result1 = "You must have at least 2 year job history";
            }

        }else{
            result1 = "You must earn at least $30k.";
        }
        System.out.println(result1);
        System.out.println("***********************************");

        /*
        task # 2 - write a program to display days
        1- monday 2- tuesday ....
         */

        int day = 6;
        String result2 = "";

        if(day >= 1 && day <= 7){
//
//            if(day == 1){
//                result2 = "Monday";
//            }else if (day == 2){
//                result2 = "Tuesday";
//            }else if(day == 3){
//                result2 = "Wednesday";
//            }else if(day ==4){
//                result2 = "Thursday";
//            }else if(day == 5){
//                result2 = "Friday";
//            }else if(day == 6){
//                result2 = "Saturday";
//            }else{
//                result2 = "Sunday";
//            }
            ///Ternary Way
        result2 = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday" :
                (day == 4) ? "Thursday" : (day == 5) ? "Friday" : (day == 6) ? "Saturday" : "Sunday";

        }else{//if line 37 is FALSE than line 54 will execute
            result2 = "Invalid Days";
        }



        System.out.println(result2);


    }
}
