package day57_Polymorphism.employeeTask;

import java.util.ArrayList;
import java.util.Arrays;

/*
 4. create a class named Apple:
create an arraylist(you decide the reference type), and store 4 testers and 3 developers objects
 */
public class Apple {
    public static void main(String[] args) {
        //polymorphism taking place
        Employee tester1 = new Tester("Robert Downey Jr.", "123", "Senior SDET", 118000, 'M');
        Employee tester2 = new Tester("Brad Pitt", "456", "Junior QA", 110000, 'M');
        Employee tester3 = new Tester("Gal Gadot", "235", "Senior SDET", 135000, 'F');
        Employee tester4 = new Tester("Anna Kendrick", "357", "Senior SDET", 135435, 'F');

        Employee developer1 = new Developer("Ashton Kutcher","442","Developer II",162000,'M');
        Employee developer2 = new Developer("Jennifer Lopez","551","Senior Developer",155000,'F');
        Employee developer3 = new Developer("Jennifer Aniston","501","Developer",145325,'F');

        //scrumTeam
        ArrayList<Employee> scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester1,tester2,tester3,tester4,developer1,developer2,developer3));

        //iterate through all employee information in the scrumteam

        for(Employee eachEmployee : scrumTeam){
            System.out.println(eachEmployee);
        }
        System.out.println("**********************************************************");
        //print the information of employee whose salary is greater than 120000 - just for practice
        for(Employee eachEmployee : scrumTeam){
            if(eachEmployee.salary > 120000){
                System.out.println("Employee Name "+eachEmployee.name+" and job title is: "+eachEmployee.jobTitle);
            }
        }

    }

}
