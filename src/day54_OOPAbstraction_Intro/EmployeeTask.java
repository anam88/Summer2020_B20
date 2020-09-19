package day54_OOPAbstraction_Intro;

import java.time.LocalDate;
/*
1.create a class named Employee (meant to be super class):
           Attributes:
                   name, gender(final), DOfB(final), jobTitle, Salary
                   create constructor that can initialize lal those attributes
                       (even final variable you should initialize them within constructor)
*/
public class EmployeeTask {
    //fields declaration
        public String name;
        final public char gender; // constant
        final public LocalDate DOfB; // constant
        public String jobTitle;
        public double salary;


    public EmployeeTask(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.DOfB = DOfB;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeTask{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOfB=" + DOfB +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

