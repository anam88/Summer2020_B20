package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface_Practice2 {
    public static void main(String[] args) {
        /*
        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();
        List<String> group3 = new ArrayList<>();
        List<String> group4 = new ArrayList<>();
        List<String> group5 = new ArrayList<>();

         */

        //list of list which contains String
        List<List<String>> groups = new ArrayList<>();
        groups.addAll(Arrays.asList(
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()));
        System.out.println(groups);//[[], [], [], []]
        /**
        * add 5 different names in each group
        * iterate the list of lists (groups)
        * print elements in each list
         */
        groups.get(0).addAll(Arrays.asList("Apple","Orange","Mango","Pear","Peach"));
        groups.get(1).addAll(Arrays.asList("Almonds","Figs","Cashew","Walnuts","Peanuts"));
        groups.get(2).addAll(Arrays.asList("Coke","Pepsi","Sprite","Mountain Dew","Cherry Coke"));
        groups.get(3).addAll(Arrays.asList("Toyota","BMW","Honda","Lexus","Tesla"));

        for (List<String> eachGroup : groups) {
            for (String eachElementInGroup : eachGroup) {
                System.out.println(eachElementInGroup);
            }
        }
    }
}
