package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A','B','C','B','C'));
        System.out.println(list);
        ArrayList<Character> nonDup = new ArrayList<>();
        for(Character each : list){//each represent each character in list ('A','B','C','B','C')
            if(! nonDup.contains(each)){
                nonDup.add(each);
    //will not use assignment operator. ArrayList is a class we will use add method
            }
        }
        System.out.println(nonDup);
    }
}
