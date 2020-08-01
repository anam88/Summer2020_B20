package day29_CustomMethods;

import java.util.Scanner;

public class GradeCalculation {
    /*
    6. calculate the grade of the student based on the score
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the score: ");
        gradeCheck(input.nextInt());
    }


    public static void gradeCheck(int score){

        if(score < 0 || score > 100){
            System.out.println("Invalid Score");
            return;//exits the current method
        }
        char grade = (score >=90 )? 'A' : (score >=80) ? 'B' : (score >= 70 )
                ? 'C' : (score >= 60) ? 'D' : 'F';
        System.out.println("Your grade is "+grade+"!");


    }
}
