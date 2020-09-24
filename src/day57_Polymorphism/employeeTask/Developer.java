package day57_Polymorphism.employeeTask;
/*
3. create a sub class of Employee named Developer
 */
public class Developer extends Employee {

    public Developer(String name, String id, String jobTitle, double salary, char gender){
        super(name, id, jobTitle, salary, gender);
    }

    @Override
    void work() {
        System.out.println("Developer "+name+" is fixing bug!");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", gender=" + gender +
                '}';
    }
}
