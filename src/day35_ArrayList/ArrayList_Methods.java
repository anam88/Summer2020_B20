package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
//set Method: replace the old elements at given index with new element

        ArrayList<String> earlyBirdList = new ArrayList<>();
        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Virginia");
        earlyBirdList.add("Ziiadin");
        earlyBirdList.add("Anam");
        earlyBirdList.add("Erfan");
        earlyBirdList.set(2, "Zekki");
        System.out.println(earlyBirdList);
        System.out.println("============================================");
//clear: clears the list, set the size to zero
        earlyBirdList.clear();
        System.out.println(earlyBirdList);
        System.out.println("============================================");
//remove(int index) -remove index number, and update the list index number
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(2);
        System.out.println(list); //[1, 2, 4, 5]
        System.out.println("============================================");
//remove(Element, inside value)
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        Integer a = 1;
        list1.remove(a);
        System.out.println(list1); //[2, 3, 4, 5]
        System.out.println("============================================");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Zarina");//0
        list2.add("Hamid");//1
        list2.add("Iman");//2
        list2.add("Anam");//3
        list2.remove(1);
        list.remove("Iman"); list2.set(0,"Fatma");
        boolean r = list2.remove("Anam");//true
        boolean r1 = list2.remove("Hamid");//false already remove line 49
        System.out.println(list2);
        System.out.println(r);
        System.out.println(r1);




    }
}
