package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_Practice2 {
    public static void main(String[] args) {
        /**
         * Using the iterator remove "Mango" from the arrayList
         */

        String[] arr = {"Ahmed","Aalis","Abzal","Ahmed","Ahmed","Ahmed","Virginia"};

        ArrayList<String> names = new ArrayList<>( Arrays.asList(arr) );
        Iterator<String> it = names.iterator();

        while (it.hasNext()){
            if(it.next().contains("Ahmed")){
                it.remove();
            }
        }
        System.out.println(names);
        System.out.println("****************************************");
        //using for loop now
        ArrayList<String> employee = new ArrayList<>( Arrays.asList(arr));

        for(Iterator<String> i = employee.iterator(); i.hasNext(); ){
            if(i.next().equals("Ahmed")){
                i.remove();
            }
        }
        System.out.println(employee);
    }
}
