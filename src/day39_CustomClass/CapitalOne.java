package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {
    public static void main(String[] args) {
        Employees employee1 = new Employees();
        Employees employee2 = new Employees();
        Employees employee3 = new Employees();
        Employees employee4 = new Employees();
        Employees employee5 = new Employees();
        Employees employee6 = new Employees();


        employee1.setEmployeeInfo("Roman",'M',"147896321",
                "QA",120000);
        employee2.setEmployeeInfo("Mary",'F',"147258963",
                "SDET",160000);
        employee3.setEmployeeInfo("Cristy",'F',"789451236"
        ,"Scrum Master",70000);
        employee4.setEmployeeInfo("Ramazan", 'M',
                "342151342", "SDET", 1550000);
        employee5.setEmployeeInfo("Musa", 'M', "123456789",
                "SDET", 135000);
        employee6.setEmployeeInfo("Anna",'F',"145987634"
        ,"SDET",1800000);

        ArrayList<Employees> employeeList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5,
                employee6));

        //find the max and min salary
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        String name = "";//name of employee who is making max
        String name1 = "";

        for(Employees eachEmployee : employeeList){
            eachEmployee.getEmployeeInfo();
            double eachSalary = eachEmployee.salary;
            if(eachSalary > max){
                max = eachSalary;
                name = eachEmployee.name;
            }
            if(eachSalary < min){
                min = eachSalary;
                name1 = eachEmployee.name;
            }
        }
        System.out.println(name+" is making max salary: "+max);
        System.out.println(name1+" is making min salary: "+min);
        System.out.println("=======================================");
        //remove empployee if making less than $15000
        /*employeeList.removeIf(p -> p.salary < 150000);
        //print employee list again
        for(Employees eachEmployee : employeeList){
            eachEmployee.getEmployeeInfo();
        }

         */
        System.out.println("=======================================");
        employeeList.removeIf(p -> p.jobTitle.equals("QA"));
        //remove employee if they are QA
        for(Employees eachEmployee : employeeList){
            eachEmployee.getEmployeeInfo();
        }
        System.out.println("=======================================");
        //remove employee if they are M
        employeeList.removeIf(p -> p.gender == 'M');
        for(Employees eachEmployee : employeeList){
            eachEmployee.getEmployeeInfo();
        }


    }
}
