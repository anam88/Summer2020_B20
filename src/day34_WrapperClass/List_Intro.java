package day34_WrapperClass;

import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
        //how we declare ArrayList
        //ArrayList<DataType> name = new ArrayList<DataType>();
        ArrayList<Integer> scores = new ArrayList<>();
        //add() method
        scores.add(95); //autoboxing, size ==> 1, index ==>0
        scores.add(100); //size==> 2, index ==> 1
        scores.add(3);//index ==> 2
        scores.add(85);
        scores.add(1,65);//65 will move to index 1

        System.out.println(scores);//[95, 100, 3]
        System.out.println("=================================");
        //get()method //retrieve 100 from the scores
        System.out.println(scores.get(2));//return Integer wrapper class



    }

}
