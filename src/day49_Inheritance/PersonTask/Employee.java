package day49_Inheritance.PersonTask;

public class Employee extends Person{
/*
create a subclass of Person called Employee
attributes: name, age, gender, Salary, ID, jobTitle
methods: work, setEmployeeInfo
*/
    public double salary;
    public int ID;
    public String jobTitle;

    public void setInfo(String name, int age, char gender,
                                double salary, int ID, String jobTitle){
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;
        setInfo(name, age, gender);
    }
    public void work(){
        System.out.println(name+" are chilling at work!");
    }

    public String toString(){
        return "\nEmployee Name: "+name+
                "\nEmployee Age: "+age+
                "\nGender: "+gender+
                "\nSalary: $"+salary+
                "\nEmployee ID: "+ID+
                "\nJob Title: "+jobTitle;
    }


}
