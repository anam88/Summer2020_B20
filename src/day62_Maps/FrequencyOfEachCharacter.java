package day62_Maps;

import java.util.*;

/**
 * 1. Write a program that stores the the character
 * and frequency of each character from a String in to a Map
 *  Ex: "aaabbbccb"
 * output:
 * {a=3, b=4, c=2}
 */
public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String str = "aaabbbccb";
        //find frequency of each character  in the given Strings
        //we are using LinkedHashMap because we want same order as it is
        Map<String, Integer> map = new LinkedHashMap<>();
        //storing each character as a list
        List<String> list = Arrays.asList( str.split("") );
        System.out.println("list = " + list);
        //using frequency method from collection class
        for (String eachCharacter : list) {
        //   need to frequency of eachCharacter from the list
            int frequency = Collections.frequency(list, eachCharacter);
        //now adding eachCharacter and their frequency to the map using put method
            map.put(eachCharacter,frequency);
        }
        System.out.println("map = " + map);


    }
}
