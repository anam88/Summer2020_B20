package day36_ArrayList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class Set_Method {
    public static void main(String[] args) {
/*
1. write a program that can set the last element of the Integer arraylist to zero
    ex:
        list = [1,2,3,4,5];
        output: [1,2,3,4,0];

 */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.set(list.size()-1,0);
        System.out.println(list);//[1, 2, 3, 4, 0]


        System.out.println("=========================");
/*
2. write a program that can multiply each odd number by 2
    ex: list = [1,2,3,4,5];
        output: [2,2,6,4,10]

 */
        ArrayList<Integer> list1 = new ArrayList<>();

// i is the index , while each is the element, right?

        for(int i = 1; i <= 20; i++){
           list1.add(i); //add 1 - 20 in the list
        }
        System.out.println(list1);
        for(int i = 0; i <= list1.size()-1; i++){
           Integer each =  list1.get(i); //each element in array
//if the number is an odd number, than multiply it by 2
            if(each % 2 != 0){
                list1.set(i, each*2);
//if even number, than multiply by 3
            }else{
                list1.set(i,each*3);
            }

        }
        System.out.println(list1);
        System.out.println("=========================");




    }

}
