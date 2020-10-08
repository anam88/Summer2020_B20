package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ListInterface_StackPractice {
    public static void main(String[] args) {
        //list of list which contains String
        List<List<String>> groups = new ArrayList<>();
        groups.addAll(Arrays.asList(
                new Stack<>(),
                new Stack<>(),
                new Stack<>(),
                new Stack<>()));
        System.out.println(groups);//[[], [], [], []]
        /**
         * add 5 different names in each group
         * then iterate the list of lists (groups)
         * then remove the last element from each group
         * then print elements in each list
         */
        groups.get(0).addAll(Arrays.asList("Apple","Orange","Mango","Pear","Peach"));
        groups.get(1).addAll(Arrays.asList("Almonds","Figs","Cashew","Walnuts","Peanuts"));
        groups.get(2).addAll(Arrays.asList("Coke","Pepsi","Sprite","Mountain Dew","Cherry Coke"));
        groups.get(3).addAll(Arrays.asList("Toyota","BMW","Honda","Lexus","Tesla"));


        for (List<String> eachGroup : groups) {
            ((Stack)eachGroup).pop(); //down-casting
            System.out.println(eachGroup);
        }
        System.out.println("groups Size = " + groups.size());
/* OUTPUT:
[Apple, Orange, Mango, Pear]
[Almonds, Figs, Cashew, Walnuts]
[Coke, Pepsi, Sprite, Mountain Dew]
[Toyota, BMW, Honda, Lexus]

 */
    }
}
