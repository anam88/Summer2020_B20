package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class DinnerTask2 {
    public static void main(String[] args) {
/*
  2. write a program that can find the frequency of character from a String
        DO NOT use nested loop
        "AABBCCDDEE"  ==> "ABCDE"
        output: A2B2C2D2E2

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
      ArrayList<String> frequencyOfElement = new ArrayList<>();
        for(String each : str){
          int count =  Collections.frequency(str, each);
          if(count == 1){
              frequencyOfElement.add(each);
          }
        }
        System.out.println(frequencyOfElement);


    }
}
