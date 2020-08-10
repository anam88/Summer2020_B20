package day39_CustomClass;
public class Employees {

    //instance variable
    String name;
    char gender;
    String SSN;
    String jobTitle;
    double salary;


    public void setEmployeeInfo(String employeeName, char employeeGender, String employeeSocial,
                                String employeeTitle, double employeeSalary){
        //assigning the argument to the instance variable
        name = employeeName;
        gender = employeeGender;
        SSN = employeeSocial;
        jobTitle = employeeTitle;
        salary = employeeSalary;

    }
    public void getEmployeeInfo(){
        System.out.println(name+" "+gender+" "+
                jobTitle+" $"+salary);
        String ssn = ""+SSN;
        System.out.println("Last four digits of SSN: "+ssn.substring((ssn.length()-4)));

    }


}
