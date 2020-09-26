package day58_Polymosphism;
/*
(change the information of the employees by yourself)
create an arraylist of employee named scrumTeam and store all the employee objects from workers
write a program that can find  how many testers, developers and Scrum master in scrum team

 */
import day57_Polymorphism.employeeTask.Developer;
import day57_Polymorphism.employeeTask.Employee;
import day57_Polymorphism.employeeTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {
    public static void main(String[] args) {
        Employee[] workers =  {
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Tester("Musa Moylam", "123456", "SDET", 130000, 'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M'),
                new Developer("Abdul","123456789","QA",110000,'M')
        };
        ArrayList<Employee> scrumTeam = new ArrayList<>(Arrays.asList(workers));
        int numOfTesters = 0;
        int numOfDevelopers = 0;
        int numOfScrumMaster = 0;



        for(int i = 0; i < scrumTeam.size(); i++){
            Employee eachEmployee = scrumTeam.get(i);
            if(eachEmployee instanceof Tester){
                numOfTesters++;
            }else if(eachEmployee instanceof Developer){
                numOfDevelopers++;
            }else {
                numOfScrumMaster++;
            }
        }
        System.out.println("Number of Tester: "+numOfTesters+"\nNumber of Developers: "+
                numOfDevelopers+"\nNumber of Scrum Master: "+numOfScrumMaster);



/*
       for(Employee eachEmployee : scrumTeam){
           if(eachEmployee instanceof Tester){
               numOfTesters++;
           }else if(eachEmployee instanceof Developer){
               numOfDevelopers++;
           }else {
               numOfScrumMaster++;
           }
       }
        System.out.println("Number of Tester: "+numOfTesters+"\nNumber of Developers: "+
                numOfDevelopers+"\nNumber of Scrum Master: "+numOfScrumMaster);

 */

    }
}
