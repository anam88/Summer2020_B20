package day46_ConstructorCalls;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Mike");
        Employee emp2 = new Employee("John","SDET");
        Employee emp3 = new Employee("Bill","Automation Tester",10478);
        Employee emp4 = new Employee("William","Scrum Master",10868,85452);

        System.out.println(emp1);
        System.out.println("**********");
        System.out.println(emp2);
        System.out.println("**********");
        System.out.println(emp3);
        System.out.println("**********");
        System.out.println(emp4);

        System.out.println("*******************************");
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(list1);
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5) );





    }
}
