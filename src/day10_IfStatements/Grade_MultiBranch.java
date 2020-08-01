package day10_IfStatements;

public class Grade_MultiBranch {
    /* grade:
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
     0 ~ 59 ==> F
    Use Multi Branch statements
     */
    public static void main(String[] args) {

        int score = 105;

        String grade = "";
        //this is one way of doing it
        if(score >=90 && score <=100){
            grade = "Your grade is A";
        }else if(score >=80 && score <= 89){
            grade = "Your grade is B";
        }else if(score >= 70 && score <= 79){
            grade = "Your grade is C";
        }else if(score >=60 && score <= 69){
            grade = "Your grade is D";
        }else if(score >= 0 && score <= 59){
            grade = "Your grade is F";
        }else{ // score < 0 || score > 100
            grade = "Invalid Score";
        }
        System.out.println(grade);
        System.out.println("***************************");
        //lets do it by using boolean as variable
        int score1 = 75;
        boolean gradeA = score1 >=90 && score1 <=100;
        boolean gradeB = score1 >=80 && score1 <= 89;
        boolean gradeC = score1 >= 70 && score1 <= 79;
        boolean gradeD = score1 >=60 && score1 <= 69;
        boolean gradeF = score1 <60;

        if(gradeA){
            grade = "Your grade is A";
        }else if(gradeB){
            grade = "Your grade is B";
        }else if(gradeC){
            grade = "Your grade is C";
        }else if(gradeD){
            grade = "Your grade is D";
        }else{
            grade = "Your grade is F";
        }
        System.out.println(grade);

    }
}
