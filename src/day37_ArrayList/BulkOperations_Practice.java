package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");
//verify that the names: Ulku, Busra are contained in students list

        boolean r =  students.containsAll(Arrays.asList("Ulku", "Busra"));
        System.out.println(r);
        System.out.println("=============================================");

//Task: write a program that can remove all the names named "Ahmed" from the list of name
        ArrayList<String> employeeNames = new ArrayList<>();
        employeeNames.addAll(Arrays.asList("John", "Smith","Ahmed","Ahmed","Ali","Iman","Muhatar"));
        System.out.println(employeeNames);
        employeeNames.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employeeNames);

    }
}
