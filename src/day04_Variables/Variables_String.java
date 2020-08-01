package day04_Variables;

public class Variables_String {
    //string practice | string is datatype | string is a sequence of character and is used in ""

    public static void main(String[] args) {

            /*declaring the String
                String schoolName = "Cybertek";
                String = Datatype
                schoolName = variable
                Cybertek = value assign to the datatype */

//        String schoolName = "Cybertek";
//        System.out.println("The school name is " + schoolName);
//*************************//


        /*task:
        declare the following variables:
        employeeName
        employeeID
        jobTitle
        Salary
        gender (char)*/


        String employeeName = "Anam";
        String employeeId = "A147";
        String jobTitle = "SDET";
        double salary  = 120_000.50;
        char gender =  'F';
        boolean isPartTime = false;
        System.out.println("Employee Name is: " + employeeName); /*you cannot put variable name inside the double quote
        if you do, it will not be variable anymore. it will be string */
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary is $" + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Is the employee working part time? " + isPartTime);



    }

}
