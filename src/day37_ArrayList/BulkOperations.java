package day37_ArrayList;

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


    }
}
