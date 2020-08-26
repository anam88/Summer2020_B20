package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {
    public Constructor(){
        //constructor with no parameters
        System.out.println("No arg constructor");
    }
    public Constructor(int a){
     //constructor with one parameters
        System.out.println("int argument");
    }
    public Constructor(String a){
        System.out.println("String argument");
    }
    public Constructor(int a, int b){
        System.out.println("two arguments");
    }

    public static void main(String[] args) {
       // Constructor obj1 = new Constructor();//no parameter
        Constructor obj2 = new Constructor(5);//with one parameter

                                    //default constructor
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> list2 = new ArrayList<>(list1);//instead of using addAll method
        System.out.println(list2);

    }
}
