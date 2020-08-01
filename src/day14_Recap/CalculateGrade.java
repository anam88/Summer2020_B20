package day14_Recap;
import java.util.Scanner;
public class CalculateGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        1. write a program that can calculate the grade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
            MUST use Scanner and nested IF
         */

        System.out.println("Enter the grade");
        int score = input.nextInt();
            input.close();//
        String message = "";

        if(score >= 0 && score <= 100){
            if(score >= 90){//greater than equal to 90 and less than equal to 100
                message = "Excellent";
            }else if(score >= 80){
                message = "Great";
            }else if(score >= 70){
                message = "Good";
            }else if(score >= 60){
                message = "Passed";
            }else{
                message = "Failed";
            }
        }else{
            message = "Invalid Entry";
        }
        System.out.println(message);
    }
}//WORKED
