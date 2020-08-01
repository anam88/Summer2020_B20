package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
/*
1. write a program that can print the list of integers in reversed order
    ex:
        list=> {1,2,3,4,5}
        output: 5 4 3 2 1
*/
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i)+" "); //iterate
        }



    }
}
