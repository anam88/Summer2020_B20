package day38_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {
    public static void main(String[] args) {


        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('C','D','F','Z','A','B','E','R','L','H','O'));
        System.out.println(list);

        //sort
        Collections.sort(list);
        System.out.println(list);


        ArrayList<String> str = new ArrayList<>();
        str.addAll(Arrays.asList("Apples","Oranges","Banana","Mangoes","Pineapple","Peach","Pear"));
        System.out.println(str);

        //swap Banana with Pear
        Collections.swap(str,2,str.size()-1);
        System.out.println(str);

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Water","Toothpaste","Oranges","Toothpaste","Coffee","Bread","Toothpaste","Eggs"));

        //frequency-returns int
        int count = Collections.frequency(items,"Toothpaste");
        System.out.println(count);

       //lets find unique element from items list and add it to new arrayList unique
        ArrayList<String> unique = new ArrayList<>();


        for(String each : items){
            int i = Collections.frequency(items,each);//return int - assign to int variable
            if(i == 1){
                unique.add(each);//add the items in to unique list if the frequency == 1
            }
        }
        System.out.println(unique);

        System.out.println("========================================================");

        //removeIf
        ArrayList<String> unique1 = new ArrayList<>();
        unique1.addAll(items);
        //remove element if frequency is greater than 1
        unique1.removeIf(p -> Collections.frequency(unique1,p) > 1);
        System.out.println(unique1);

        System.out.println("========================================================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,75,96,0,23,45,8,0,-9,0,-4,101,0,500,0,4700,3,4,-14));
        //max | min
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("Max num: "+max);

        System.out.println("Min num: "+min);

        System.out.println("========================================================");

        //replace
        Collections.replaceAll(nums,0,100);
        System.out.println(nums);


    }
}
