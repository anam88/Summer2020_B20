package day42_static;

public class Developer {
/* create a class called Developer
Attributes:
name, employeeID, JobTitle, Salary
Actions:
setInfo(), coding(),  fixBug(), toString()

*/
    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;
    public void setInfo(String name,char gender,long employeeID,String jobTitle,double salary){
        this.name = name;
        this.gender = gender;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String toString(){
        return "\nName of the Developer: "+name+"\nGender: "+gender+
                "\nDeveloper employee ID: "+employeeID+
                "\nJob Title: "+jobTitle+"\nSalary: $"+salary;
    }
    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixBugs(){
        System.out.println(name+" is crying, because he needs to fix the bug");
    }
}

