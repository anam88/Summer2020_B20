package day36_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {

         /*Arrays: utility class for arrays
      Collections: utility for collection

     */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(55);
        list.add(10);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Max num: "+list.get(list.size()-1));
        System.out.println("Min num: "+list.get(0));

        System.out.println("==================");
        ArrayList<String>list2 = new ArrayList<>();
            list2.add("A");
            list2.add("B");
            list2.add("C");
            list2.add("D");
        System.out.println(list2);
        Collections.swap(list2,3,2); //swap D with C
        System.out.println(list2);
        System.out.println("==================");

        ArrayList<Character> charList = new ArrayList<>();
            charList.add('A');
            charList.add('D');
            charList.add('B');
            charList.add('C');
            charList.add('B');
        System.out.println(charList);
       int count =  Collections.frequency(charList,'A');//returns int
        System.out.println(count);



    }

}
