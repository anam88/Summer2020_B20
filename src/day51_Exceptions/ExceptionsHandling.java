package day51_Exceptions;

import java.util.ArrayList;

public class ExceptionsHandling {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//empty array list
        String exceptionMessage = "";
        try{
            System.out.println(list.get(1)); //unchecked
        }catch (IndexOutOfBoundsException e){
            exceptionMessage = e.getMessage();
        }
        System.out.println("next step");
        System.out.println(exceptionMessage);

    }

}
