package day57_Polymorphism.employeeTask;
/*
1. create an abstract class named Employee
            Attributes: name, id, jobTitle, salary, gender
            abstract method: work
            add a constructor to initialize the field
 */
public abstract class Employee {
    String name;
    String id;
    String jobTitle;
    double salary;
    char gender;

    abstract void work();

    public Employee(String name, String id, String jobTitle, double salary, char gender){
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }
}
