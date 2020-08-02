package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,56,78,9800,100,20,0,-1,-3,59,68,2,5,400,50));

        //maxNum
        Integer maxNum = Collections.max(list);
        //minNum
        Integer minNum = Collections.min(list);
        System.out.println(maxNum);
        System.out.println(minNum);
    }
}
