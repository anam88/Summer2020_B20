package day52_Exceptions.LaborDayTask;
/*
create subclasses of Employee called:  1. Tester
 */
public class Tester extends Employee{

    public Tester(String name, int age, char gender, String jobTitle, double salary){
        super(name,age,gender,jobTitle,salary);

    }


    public String toString() {
        return "Tester{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
