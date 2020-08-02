package day37_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
           /*
     1. write a program that can find the unique characters from a string
                DO NOT use nested loop
                "ABABCDEE"
                output: C D */

        String str = "AABBOOPFRRHCDDE";
        String uniques = "";
        ArrayList<Character> list = new ArrayList<>();

       for(char each : str.toCharArray()){
//if you use string instead of char
       //String each : str.split("")
           list.add(each); //each represent all the elements in the str
       }
        System.out.println(list);

       for(Character each : list){
           int count = Collections.frequency(list, each);
           //will return frequency of every single element from list
           if(count == 1){
               uniques += each;
           }
       }
        System.out.println(uniques);


    }


}
