package day57_Polymorphism.employeeTask;

/*
2. create a subclass of Employee named Tester
 */
public class Tester extends Employee{

    public Tester(String name, String id, String jobTitle, double salary, char gender){
        super(name, id, jobTitle, salary, gender);
    }

    @Override
    void work() {
        System.out.println("Tester "+name+" is working on automating the user-story 0123");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", gender=" + gender +
                '}';
    }
}
