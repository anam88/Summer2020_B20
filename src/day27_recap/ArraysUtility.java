package day27_recap;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        /*
        sort():
        toString():
        equals():
         */

//SORT
        String names[] = {"Odina","Anam","Lilia","Berk","Emine","Alina"};
        //array utilities class
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        int scores[] = {80,70,45,100,20,3,99};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Max "+ scores[scores.length-1]);
        System.out.println("Min "+scores[0]);

//equals

    }
}
