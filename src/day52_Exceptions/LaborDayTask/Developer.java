package day52_Exceptions.LaborDayTask;
/*
create a subclass of Employee called: Developer
 */
public class Developer extends Employee{
    public Developer(String name, int age, char gender, String jobTitle, double salary){
        super(name,age,gender,jobTitle,salary);
    }


    public String toString() {
        return "Developer{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
