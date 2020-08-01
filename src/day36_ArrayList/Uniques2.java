package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques2 {
    public static void main(String[] args) {

/*
3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
ex: list==> {1,1,2,3,3,4,5}
uniques ==> {2,4,5}
*/
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(20);

        ArrayList<Integer> uniqueElement = new ArrayList<>();

        for(Integer each : list){
            int count = Collections.frequency(list, each);
            if(count == 1){
                uniqueElement.add(each);
            }
        }
        System.out.println(uniqueElement);
    }
}
