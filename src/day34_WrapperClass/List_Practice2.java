package day34_WrapperClass;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
//write a program that can print max and min number from ArrayList
        ArrayList<Integer> num = new ArrayList<>();
            num.add(35);
            num.add(4);
            num.add(50);
            num.add(100);
            num.add(2);

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(Integer each : num){
                if(each > max){
                    max = each;
                }
                if(each < min){
                    min = each;
                }
            }
        System.out.println("Max value: "+max);
        System.out.println("Min value: "+min);

    }
}
