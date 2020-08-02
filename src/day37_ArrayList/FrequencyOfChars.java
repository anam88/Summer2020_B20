package day37_ArrayList;

import Library.Util;

import java.util.ArrayList;
import java.util.Collections;
public class FrequencyOfChars {
    public static void main(String[] args) {
        /*
         2. write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDEE"  ==> "ABCDE"
                        output: A2B2C2D2E2

         */
        String str = "AAABBC";

        ArrayList<String> list = new ArrayList<>();
        for(String each : str.split("")){
            list.add(each);
        }
        System.out.println(list);

        String nonDup = Util.duplicates(str); //remove duplicates
        for(String each : nonDup.split("")){
            int count = Collections.frequency(list, each);
            System.out.println(each+count);
        }

    }
}
