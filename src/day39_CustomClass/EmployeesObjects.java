package day39_CustomClass;

public class EmployeesObjects {
    public static void main(String[] args) {
        //create object by using Array list
        Employees[] employeeData = { new Employees() , new Employees(), new Employees(),
                new Employees()};
        //setting the employee info
        employeeData[0].setEmployeeInfo("John",'M',"147896321","QA",
                120500);
        employeeData[1].setEmployeeInfo("Mike",'M',"456789632","Scrum Master",
                80000);
        employeeData[2].setEmployeeInfo("Sarah",'F',"147258963","Developer",
                150000);
        employeeData[3].setEmployeeInfo("Anna",'F',"852963214","Senior SDET",
                165000);



    }
}
