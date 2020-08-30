package day48_Inheritance.EmployeeTask;

/*
Developer
variables: salary, name, id, jobTitle, gender
methods: fixing bugs, setInfo, toString
*/
public class Developer extends Employee {
    public Developer(String employeeName,int employeeID,String jobTitle, double employeeSalary,
                     char employeeGender){
        setEmployeeInfo(employeeName,employeeID,jobTitle,employeeSalary,employeeGender);
    }
    public void fixingBugs(){
        System.out.println(employeeName+" is fixing bugs");
    }

}
