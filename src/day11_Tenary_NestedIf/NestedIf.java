package day11_Tenary_NestedIf;

public class NestedIf {

    /*
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
     0 ~ 59 ==> F
     Use Nested IF
     */
    public static void main(String[] args) {
        int score = -2;
        String result = "";

        //if pre condition on line 18 is true than code from 20-29 get executed
        // depending on which one is true
        if (score >= 0 && score <= 100) { //valid score greater than equal to 0 but
            // less than equal to 100

            if (score >= 90) { //greater than equal 90 - 100
                result = "A";
            } else if (score >= 80) { //greater than equal to 80 - 90
                result = "B";
            } else if (score >= 70) { // greater than equal to 70 - 80
                result = "C";
            } else if (score >= 60) { // greater than equal to 60 - 70
                result = "D";
            } else{ // greater than equal to 50 -60
                result = "F";
            }
        }else {//invalid score // this else statement is part of pre condition if statement
            result = "Invalid";
        }
        System.out.println(result);
        System.out.println("***********************************");




    }
}