package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GradeTask_AfterClass {
    public static void main(String[] args) {
         /*
        how many students made:
        A, B, C, D
        how many failed?
        Do not use loop
         */


        ArrayList<Integer> grades = new ArrayList<>();

        grades.addAll(Arrays.asList(100,90,85,75,55,45,73,73,35,47,60,87,77,67,57,47,93,83,63,53,43));
        Collections.sort(grades);
        System.out.println(grades);


        ArrayList<Integer>  gradeA       = new ArrayList<>(); //90 - 100
        gradeA.addAll(grades);
        System.out.println(gradeA);
//p represent each value in the grades, if the grades are less than 90, remove them
        gradeA.removeIf(p -> p < 90);
        System.out.println("Grade A: "+gradeA);

        ArrayList<Integer>  gradeB       = new ArrayList<>(); //80 - 89
        gradeB.addAll(grades);
        gradeB.removeIf(p -> p < 80 || p > 89);
        System.out.println("Grade B: "+gradeB);

        ArrayList<Integer>  gradeC       = new ArrayList<>();//70 - 79
        gradeC.addAll(grades);
        gradeC.removeIf(p -> p < 70 || p > 79);
        System.out.println("Grade C: "+gradeC);


        ArrayList<Integer>  gradeD = new ArrayList<>();// 60 - 69
        gradeD.addAll(grades);
        gradeD.removeIf(p -> p < 60 || p > 69);
        System.out.println("Grade D: "+gradeD);

        ArrayList<Integer>  gradeF       = new ArrayList<>();// below 60
        gradeF.addAll(grades);
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
        System.out.println("Grade F: "+gradeF);


    }
}
