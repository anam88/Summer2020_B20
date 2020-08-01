package day34_WrapperClass;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> oddList = new ArrayList<>(); //save all odd # in oddList
        ArrayList<Integer> evenList = new ArrayList<>();//save all even # in evenList
        //between 0-100
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                evenList.add(i);
            }else{
                oddList.add(i);
            }
        }
        System.out.println(evenList);
        System.out.println();
        System.out.println(oddList);

        System.out.println("===============================");

        ArrayList<String> str = new ArrayList<>();
                str.add("milk");
                str.add("meat");
                str.add("eggs");
                str.add("bread");
                str.add("mango");

                for(int i = str.size()-1; i >= 0; i--){
                    System.out.print(str.get(i) + "  ");
                }
        System.out.println();

                for(String each: str){
                    System.out.print(each+" ");
                }
        System.out.println("============================");





    }
}
