package day47_Encapsulation;

public class EmployeeOfCapitalOne {
    public static void main(String[] args) {
        CapitalOneEmployees newEmployee = new CapitalOneEmployees("John",
                32,"Senior Automation Eng.");
        newEmployee.setid(1234);
        newEmployee.setSalary(154256);
        newEmployee.setAddress("123 Main Street Chicago IL 00000");
        System.out.println(newEmployee);
    }
}
