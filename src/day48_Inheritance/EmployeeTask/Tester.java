package day48_Inheritance.EmployeeTask;

/*
 subclass: Tester
variables: salary, name, id, jobtitle, gender
add a constructor
methodds: findingbugs, setInfo, toString
 */
public class Tester extends Employee {

    public Tester(String employeeName,int employeeID,String jobTitle,double employeeSalary,
                  char employeeGender){
        setEmployeeInfo(employeeName,employeeID,jobTitle,employeeSalary,employeeGender);
    }
    public void findingBugs(){
        System.out.println(employeeName+" is finding bugs!");
    }
    public void smokeTesting(){
        System.out.println(employeeName+" is running smoke Test!");
    }


}
