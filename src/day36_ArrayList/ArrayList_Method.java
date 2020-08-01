package day36_ArrayList;

import java.util.ArrayList;
/*
indexOf()- print the first index int the list of given element return int
lastIndexOf() - print the last index in the list  of given element return int
contains()- returns boolean if the element is contained or not
equals()-if two array list are equal or not-return boolean
isEmpty()
 */
public class ArrayList_Method {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int a = list.indexOf(40);
        System.out.println(a); // 3
       int b = list.indexOf(60);
        System.out.println(b);//return -1 mean it does not exist
        int c = list.lastIndexOf(40); // 3 print the last index in the list  return int
        System.out.println(c);
        boolean r1 = list.contains(100);
        System.out.println(r1); //false

        System.out.println("=======================================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("cybertek");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("cybertek");
        System.out.println(list1.equals(list2));
//equal return boolean as long as size, order and inside element is SAME




    }
}
