package day60_Collection;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(); //add, remove, set, removeAll, size......
        list1.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("ArrayList = " + list1);
        System.out.println(list1.get(2));

        List<Integer> list2 = new LinkedList<>();  //add, remove, set, removeAll, size......
        list2.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("LinkedList = " + list2);
        System.out.println(list1.get(1));

        List<Integer> list3 = new Vector<>();  //add, remove, set, removeAll, size......
        list3.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Vector = " + list3);
        System.out.println(list1.get(4));

        List<Integer> list4 = new Stack<>(); //add, remove, set, removeAll, size......
        list4.addAll(Arrays.asList(1,2,3,4,5));
        list1.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Stack = " + list4);
        System.out.println(list1.get(5));
        ( (Stack)list4 ).pop(); //down-casting
        System.out.println(list4);
        System.out.println("********************");
        Stack<Integer> list5 = new Stack<>();
        list5.addAll(Arrays.asList(10,9,8,7,6,5));
        System.out.println(list5);//[10, 9, 8, 7, 6, 5]
        list5.pop();
        System.out.println(list5);//[10, 9, 8, 7, 6]
        int lastObj = list5.pop();
        System.out.println(list5);//[10, 9, 8, 7]

        System.out.println("********************");

        int[] arr1 = {1,2,3,4};
        int[][] arr2 = {{1,2,3,4}, {5,6,7,8,9}};
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Apple");
        System.out.println(l1);
        System.out.println("******************************************");

        //ArrayList contains an object of ArrayList
        ArrayList<ArrayList<Integer>> l2 = new ArrayList<>(); //list of list
        //l2.add(1);
        l2.add(new ArrayList<Integer>( Arrays.asList(1,2,3,4)) );
        l2.add(new ArrayList<>());
        //now we are going to add elements in the second arrayList in l2
        l2.get(1).addAll(Arrays.asList(5,6,7,8,9));
        System.out.println(l2);
        //[[1, 2, 3, 4], [5, 6, 7, 8, 9]]
        //    0        ,     1
        l2.get(0).removeAll(Arrays.asList(1,3));
        System.out.println("l2 = " + l2);
        //getting size of both arrayList in the arrayList
        System.out.println("size of first arrayList: "+l2.get(0).size()+
                "\nsize of second arrayList: "+l2.get(1).size());

        System.out.println("**************************************");

    }
    public void method1(){

    }
    public synchronized void method2(){
        //vector class - method contain synchronized keywords
    }

}
