package day09_IfStatement;

public class Warmup_Task03 {
    /*
    Task03:
    Write a program that can calculate the grade based on the score
        if score is between 90 to 100 ==> A
        if score is between 80 to 90 ==> B
        if score is between 70 to 80 ==> C
        if score is between 60 to 70 ==> D
        if score is below 60 ==> F
        Ex: score = 85;
            output:
                Your grade is B

     */
    public static void main(String[] args) {

        int grade = 85;
        if (grade >= 90 && grade <= 100){
            System.out.println("A");
        }
        if (grade >= 80 && grade <= 89){
            System.out.println("B");
        }
        if (grade >= 70 && grade <= 79){
            System.out.println("C");
        }
        if (grade >= 60 && grade <= 69){
            System.out.println("D");
        }
        if (grade <= 59){
            System.out.println("F");
        }


    }
}
