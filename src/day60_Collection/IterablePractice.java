package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterablePractice {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for(int i = 0; i < list1.size(); i++){//we are iterating the index number
            if(list1.get(i) < 5){
                list1.remove(i);
            }
        }
        System.out.println(list1);
        System.out.println("*********************************");

        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
       /* for (Integer eachInteger : list2) {
            if(eachInteger < 5){
                list2.remove(eachInteger);
            }
        }

        */
        System.out.println(list2);
        System.out.println("****************************************");
        ArrayList<Integer> list3= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3.removeIf(p -> p < 5); //internally use the iterator that is why it worked
        System.out.println(list3);

        System.out.println("****************************************");
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //iterator is iterating arrayList
        Iterator<Integer> it = list4.iterator();

        while (it.hasNext()){
            if(it.next() < 5){
                it.remove();
            }
        }
        System.out.println(list4);
        System.out.println("****************************************");
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for(Iterator<Integer> i = list5.iterator(); i.hasNext(); ){
            if(i.next() < 5){
                i.remove();
            }
        }
        System.out.println(list5);




    }
}
