package day48_Inheritance.EmployeeTask;

public class Employee {
    /*
    superclass: employee
    variables: salary, name, id, jobtitle, gender
    methods setInfor, toString

     */
    public String employeeName;
    public int employeeID;
    public String jobTitle;
    public double employeeSalary;
    public char employeeGender;

    public void setEmployeeInfo(String employeeName,int employeeID,String jobTitle,double employeeSalary,
                                char employeeGender){
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.employeeSalary = employeeSalary;
        this.employeeGender = employeeGender;
    }
    public String toString(){
        return "\nEmployee Name: "+employeeName+"\nEmployee ID: "+employeeID+
                "\nEmployee Gender: "+employeeGender+"\nJob Title: "+jobTitle+
                "\nSalary: $"+employeeSalary;
    }


}
