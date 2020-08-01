package day36_ArrayList;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

/*
3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
ex: list==> {1,1,2,3,3,4,5}
uniques ==> {2,4,5}
*/
        ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(3);
            list.add(4);
            list.add(20);

        ArrayList<Integer> uniqueElement = new ArrayList<>();

        for(int i = 0; i <= list.size()-1; i++){
//outer loop is getting each of the element
            Integer element = list.get(i);
            Integer count = 0;
//inner loop finding frequency of each element
            for(Integer each : list){
                if(each == element){
                    count++;
                }
            }
//verify if the frequency of element is unique
            if(count == 1){
                uniqueElement.add(element);
            }

        }
        System.out.println(uniqueElement);




    }
}
