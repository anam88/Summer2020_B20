package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeTask_AfterClass {
    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(100,90,75,85,65,85,55,45,73,73,35,47));
        ArrayList<Integer>  gradeA       = new ArrayList<>(); //90 - 100
        ArrayList<Integer>  gradeB       = new ArrayList<>(); //80 - 89
        ArrayList<Integer>  gradeC       = new ArrayList<>();//70 - 79
        ArrayList<Integer>  gradeD       = new ArrayList<>();// 60 - 69
        ArrayList<Integer>  gradeF       = new ArrayList<>();// below 60

        /*
        how many students made:
        A, B, C, D
        how many failed?
        Do not use loop
         */
    }
}
