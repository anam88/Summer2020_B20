package day60_Collection;

import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(8,5,4,3,2,10,7,1));//does not keep the insertion order
        s1.addAll(Arrays.asList(8,8,8,8,8,8,8,8,8));//does not accept duplicate
        System.out.println("HashSet = " + s1);

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.addAll(Arrays.asList(8,5,4,3,2,10,7,1)); //keep the insertion order it is
        s2.addAll(Arrays.asList(8,8,8,8,8));//does not accept duplicate
        System.out.println("LinkedHashSet = " + s2);

        //TreeSet Implements SortedSet | does not take null key
        Set<Integer> s3 = new TreeSet<>();
        s3.addAll(Arrays.asList(8,5,4,3,2,10,7,1));//sort it
        s3.addAll(Arrays.asList(8,8,8,8,8));//does not accept duplicate
        System.out.println("TreeSet = " + s3);


    }
}
