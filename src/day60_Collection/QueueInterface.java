package day60_Collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        //since Queue is an interface we cannot create a object of it
       // Queue<Integer> q1 = new Queue<Integer>()
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("q1 = " + q1);
        int firstObj = q1.poll();
        System.out.println("firstObj = " + firstObj);
        System.out.println("q1 = " + q1);
    }
}
