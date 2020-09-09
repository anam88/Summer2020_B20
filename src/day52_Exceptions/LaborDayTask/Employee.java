package day52_Exceptions.LaborDayTask;
/*
create a subclass of person called Employee
attributes: name, age, gender, ID, jobTitle, salary

 */
public class Employee extends Person{
    public String jobTitle;
    public double salary;
// first constructor: can initialize name, age, gender of the employee
    public Employee(String name, int age, char gender){
        super(name, age, gender);
    }
//second constructor: can initialize the entire attributes of the Employee class
    public Employee(String name, int age, char gender, String jobTitle, double salary){
       super(name, age, gender);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
//  override the toString method  that can help you to print out the EmployeeObject

    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
