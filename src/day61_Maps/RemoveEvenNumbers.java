package day61_Maps;

import java.util.*;

/**
 *  2. write a program that can remove the even numbers from a Set of Integers
 *            order should not be sorted
 *             DO NOT use Lambda expressions
 */
public class RemoveEvenNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {4,8,7,25,24,40,112,220,9,91,90,9,9,9,9,9,9,9};
        //add array to the list, by using bulk operations of the collections
        Set<Integer> list = new LinkedHashSet<>();
        list.addAll(Arrays.asList(numbers));
        System.out.println("list = " + list);
     //   list = [4, 8, 7, 25, 24, 40, 112, 220, 9, 91, 90]
        Iterator<Integer> it =  list.iterator();
        while(it.hasNext()){
        if(it.next() % 2 == 0){ //if number is even
            it.remove();//then remove it
        }
        }
        System.out.println("list = " + list); //list = [7, 25, 9, 91]

    }
}
