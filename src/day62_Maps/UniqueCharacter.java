package day62_Maps;

import java.util.*;

/**
 * 2. write a program that stores the unique characters from a string into map:
 * Ex: "abacbdeef";
 * output:
 * {c=1, d=1, f=1}
 */
public class UniqueCharacter {
    public static void main(String[] args) {
        String str = "abacbdeffj";
        //using linkedHashMap to keep the order same
        Map<String, Integer> uniqueCharacters = new LinkedHashMap<>();
        //storing each character as a list
        List<String> list = Arrays.asList( str.split("") );
        System.out.println("list = " + list);
        for (String eachCharacter : list) {
//if from the list eachCharacter frequency == 1 than add it in the map
            if((Collections.frequency(list,eachCharacter) == 1)){
                uniqueCharacters.put(eachCharacter,1);
            }
        }
        System.out.println("uniquesCharacter = " + uniqueCharacters);

        //verify that J is unique
        System.out.println("uniqueCharacters = " + uniqueCharacters.containsKey("j"));
    }
}
