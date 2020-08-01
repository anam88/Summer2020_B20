package day12_Switch_Scanner;

public class AgeGroups_WarmUpTask {
    /*
    2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
     */

    public static void main(String[] args) {

        //Must condition: age cannot be negative or greater than 150

        int age = 165;
        boolean ageGroup = age > 0 && age <= 150;
        String result = "";

        if(ageGroup){//if this statement is false than line 31 will execute
//            if(age < 21){//less than 21
//                result = "Teenager";
//            }else if(age <= 55){//age >=21 && age <= 55
//                result = "Adult";
//            }else{ //greater than 55
//                result = "Senior";
//            }
            result = (age < 21) ? "Teenager" : (age <= 55) ? "Adult" : "Senior";
        }else{// age cannot be negative or greater than 150
            result = "Invalid Age Group";
        }
        System.out.println(result);



    }
}
