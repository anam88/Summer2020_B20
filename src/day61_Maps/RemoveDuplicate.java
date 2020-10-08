package day61_Maps;

import java.util.*;

/**
 * 3. write a program that can remove the duplicated Integers from a List of Integer
 *             Do Not change the insertion order
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,4,5,2,45,8,9,9,8,7,6,5,4,3));
        System.out.println("list = " + list);
        //list = [2, 4, 5, 2, 45, 8, 9, 9, 8, 7, 6, 5, 4, 3]
       LinkedHashSet<Integer> set = new LinkedHashSet<>(list);//add list to new obj of linkedHashSet to remove dup
        System.out.println("set = " + set);
        //set = [2, 4, 5, 45, 8, 9, 7, 6, 3]

        //add set in to the list so the list output should be same as set
        list.clear();;
        list.addAll(set);
        System.out.println("list = " + list);
        // list = [2, 4, 5, 45, 8, 9, 7, 6, 3]
        }
}
