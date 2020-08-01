package day35_ArrayList;

import java.util.ArrayList;

public class CombineTwoArray_List {
/*
  3. write a program that can combine two String arrays into one arrayList
        ex:
            arr1 = {"A", "B", "C"};
            arr2 = {"D", "E", "F", "G"};
            list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
    public static void main(String[] args) {
        String[] group1 = {"Aalia", "Mohammed","Aslan","Ernis"};
        String[] group2= {"Zarina", "Mee", "Irina", "Virginia", "Ali", "Dawud"};
//take all the names from array and put it in array list
        ArrayList<String> studentName = new ArrayList<>();

        for(String each : group1){
            studentName.add(each);
        }
        for(String each : group2){
            studentName.add(each);
        }

        System.out.println(studentName);

    }
}
