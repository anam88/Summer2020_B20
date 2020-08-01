package day09_IfStatement;

public class Warmup_Task02 {
    /*
    Task02:
    write a program that can calculate the grade.
        1. if grade is bigger then 90 output "Excellent"
        2. if the grade is bigger then 70 and smaller then 90 output "Good"
        3. if grade is bigger then 60 and smaller then 70 output "Pass"
        4. if grade is smaller then 60 output "Fail"
        ex: score = 75
            output:
                Good
        HINT: you will need && logic

     */
    public static void main(String[] args) {
        int grade = 67;
        if(grade < 60){
            System.out.println("Fail");
        }
        if(grade > 60 && grade < 70){
            System.out.println("Pass");
        }
        if(grade > 70 && grade < 90){
            System.out.println("Good");
        }
        if(grade > 90){
            System.out.println("Excellent");
        }


    }

}
