package day47_Encapsulation;

public class CapitalOneEmployees {
/*
2. create a class called CapitalOneEmployees
instance variables:
        employeeName
        employeeAge
        jobTitle
    private ID
    private salary
    private address
    company name = "Capital One"
    generate getters & setters for private variables
*/
    public String employeeName;
    public int employeeAge;
    public String jobTitle;

    public CapitalOneEmployees(String employeeName, int employeeAge, String jobTitle){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.jobTitle = jobTitle;
    }

    public static String companyName;
    static {
        companyName = "Capital One";
    }

    private int id;
    private double salary;
    private String address;

    public void setid(int id){
        this.id = id;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
    public String getAddress(){
        return address;
    }

    public String toString(){
        return "\nCompany Name: "+companyName+"\nName of Employee: "+employeeName+
                "\nAge of employee: "+employeeAge+"\nJob Title: "+jobTitle+"\nEmployee ID: "+getId()+
                "\nSalary: $"+getSalary()+"\nAddress: "+getAddress();
    }


}
