package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//REMOVE ALL THE UNIQUE ELEMENTS
public class FindDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //addAll method help to add multiple elements, accepts ONLY collection type
        //Arrays.asList - arrays of Value | returns collection type
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7,8));
        System.out.println(list);
        list.removeIf(p -> Collections.frequency(list, p) == 1);
        System.out.println(list);
        System.out.println("=================================");

//keep the name that has first and last character same(ignore case sensitivity)
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Canada","Bob","David","Lan","Abida","Ebrahim","Farida"));
        System.out.println(names);
        names.removeIf(p -> p.toLowerCase().charAt(0) != p.charAt(p.length()-1));
        //toLowerCase - to remove case senstivity
        //charAt(0) - refers to 0 index and first character
        //charAt(p.length()-1) - refers to the last character of each name
        System.out.println(names);
        System.out.println("=================================");





    }
}
