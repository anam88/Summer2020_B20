package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class DinnerTask {
    public static void main(String[] args) {
        /*
        Task: write a program that can find a unique character from a string
        DO NOT USE NESTED LOOP
         "ABABCDEE"
         */
        ArrayList<String> str = new ArrayList<>();
            str.add("A");
            str.add("B");
            str.add("A");
            str.add("B");
            str.add("C");
            str.add("D");
            str.add("E");
            str.add("E");

        ArrayList<String> uniqueElement = new ArrayList<>();

        for(String each : str){
            int count = Collections.frequency(str,each);
            if(count == 1){
                uniqueElement.add(each);
            }
        }
        System.out.println(uniqueElement);

    }
}
