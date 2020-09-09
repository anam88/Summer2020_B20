package day52_Exceptions.LaborDayTask;

import java.util.ArrayList;
import java.util.Arrays;

/*
4. create a class called Google
create 5 objects of the Tester and 5 objects of Developer
create an arrayList of Tester and an ArrayList of Developer, store those 5 objects of the Tester & Developers
use for each loop to iterate Tester & Developer objects from in those arrayLists
print out the tester & developer who has the highest salary
 */
public class Google {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Robert Downey Jr.", 55, 'M',"Senior SDET",118000);
        Tester tester2 = new Tester("Brad Pitt",56, 'M', "Junior QA",110000 );
        Tester tester3 = new Tester("Jason Momoa",41,'M',"Senior QA",125000);
        Tester tester4 = new Tester("Gal Gadot", 35, 'F',"Senior SDET",135000);
        Tester tester5 = new Tester("Anna Kendrick",35,'F',"Senior SDET",135435);

        Developer developer1 = new Developer("Jennifer Aniston",51,'F',"Developer",145325);
        Developer developer2 = new Developer("Jennifer Lopez",51,'F',"Senior Developer",155000);
        Developer developer3 = new Developer("Mila Kunis",37,'F',"Developer I",158000);
        Developer developer4 = new Developer("Ashton Kutcher",42,'M',"Developer II",162000);
        Developer developer5 = new Developer("Hugh Jackman",51,'M',"Developer III",161000);

        ArrayList<Tester> allTesters = new ArrayList<>();
        allTesters.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));
        ArrayList<Developer> allDevelopers = new ArrayList<>();
        allDevelopers.addAll(Arrays.asList(developer1,developer2,developer3,developer4,developer5));

        String highSalaryTester = "";
        double maxTesterSalary = Double.MIN_VALUE;
        for(Tester eachTester: allTesters){
            if(eachTester.salary > maxTesterSalary){
                maxTesterSalary = eachTester.salary;
                highSalaryTester = eachTester.name;
            }
        }

        System.out.println(highSalaryTester+" has the highest salary in the Tester Group");

        String highSalaryDeveloper = "";
        double maxDeveloperSalary = Double.MIN_VALUE;
        for(Developer eachDeveloper : allDevelopers){
            if(eachDeveloper.salary > maxDeveloperSalary){
                maxDeveloperSalary = eachDeveloper.salary;
                highSalaryDeveloper = eachDeveloper.name;
            }
        }
        System.out.println(highSalaryDeveloper+ " has the highest salary in the Developer Group");





    }
}
