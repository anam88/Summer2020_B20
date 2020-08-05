package day38_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Method {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "Lexus", "Range Rover", "Ferrari",
                "Honda","Lamborghini","Lexus","Ferrari","Mazada","Maruti", "Mercedes","Tesla"));


        //remove - once at a time( we can remove by giving index # or by passing the object)
        cars.remove(2); //remove Range Rover by using index number

        cars.remove("Ferrari");//remove method by passing object, will remove first passing object

        cars.removeAll(Arrays.asList("Lexus"));
    /*will remove all the elements matching the given object
we use Arrays.asList because removeAll is part of Bulk operation collection time,
and in order to pass arrayList
        we need to use Arrays.asList
        */

        //remove all the cars name that have M or m in it(ignore case sensitivity)
        cars.removeIf(p -> p.toLowerCase().contains("m"));

        //retainAll, will only keep Tesla in the list and will remove everything else
        cars.retainAll(Arrays.asList("Tesla"));

        System.out.println(cars);
        System.out.println("==================================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Milk","Bread","Paper Towels","Onions","Avocado","Tomatoes"));
        System.out.println(groceryList);


        //contain check if the element is in the list and will return boolean
        boolean pepsiOrNot = groceryList.contains("Pepsi");
        System.out.println(pepsiOrNot);

        //containAll
        boolean allOrNot = groceryList.containsAll(Arrays.asList("Eggs","Milk","Water"));
        System.out.println(allOrNot);

        //size
        System.out.println("Total number of items: "+groceryList.size());

        //set
        groceryList.set(5, "Apples");
        System.out.println(groceryList);

        //indexOf-will replace Paper Towels with Detergent
       groceryList.set(groceryList.indexOf("Paper Towels"),"Detergent");
       System.out.println(groceryList);






    }
}
