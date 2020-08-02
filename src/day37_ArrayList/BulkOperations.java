package day37_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
 //containsAll()

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        boolean r = list.contains(1);//accept element

        ArrayList<Integer> element = new ArrayList<>();
//containsAll: accept collection type, arrayList is collection type therefore created a new arrayList
        element.add(1);
        element.add(2);
        element.add(3);
        boolean r1 = list.containsAll(element);//if all elements are contain print true, if not false

        System.out.println(r1);
        System.out.println("===============================");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        //verify that 1,2,4 are contained in the list2

      boolean r3 =  list1.containsAll(Arrays.asList(1,2,4));
  //will be takes as array and will return as collection type
        System.out.println(r3);
        System.out.println("===============================");

//addAll(CollectionType)
        ArrayList<Integer> num = new ArrayList<>();
        //add: 30,25,40,15,55,65,75,85,95,100
        Integer[] n = {30,25,40,15,55,65,75,85,95,100};
        num.addAll(Arrays.asList(n));
        //by calling asList method we are able to pass array and convert them in to arrayList
        //you can also pass the value by itself using asList
        System.out.println(num);
        System.out.println("===============================");

//TASK
        ArrayList<String> group9 = new ArrayList<>();
        //add all student name in your group
        String[] str = {"Zarina","Hamid","Iman","Fatma","Murat","Shoaib","Alena"};
        group9.addAll((Arrays.asList(str)));
        System.out.println(group9);
        //verify your mentor and one of your closet friend name are contain in the list OR not
        boolean containOrNot = group9.containsAll(Arrays.asList("Dardan", "John"));
        System.out.println(containOrNot);
        System.out.println("===============================");
//removeAll()

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,2,2,3,4,5,5,6,7,8,9,10,11,12,13));
        System.out.println(nums);
        //remove all 1,2,5,10,11
        nums.removeAll(Arrays.asList(1,2,5,10,11));
        System.out.println(nums);
        System.out.println("======================================");
//retainAll(CollectionType)
        ArrayList<Integer> num1 = new ArrayList<>();
        num1. addAll(Arrays.asList(1,1,2,2,3,4,5,5,6,7,8,9,10,11,12,13));
        System.out.println(num1);
        //only keep the elements that are either 1, or 2, or 3, or 9
        num1.retainAll(Arrays.asList(1,2,3,9));
        System.out.println(num1);
        System.out.println("======================================");


    }
}
