package day05_ArithmeticOperators;

public class EmployeeInfo2 {

    /*write a program that can display the full info of the employee
                ex:
                         firstName = John
                         lastName = Daniel
                         gender = Male
                         age = 35
                         companyName = CapitalOne
                         jobTitle = SDET
                         isFullTime = true
                         isMarried = false
                          salary = 120000.50 */
    public static void main(String[] args) {
        String f_Name = "John";
        String l_Name = "Daniel";
        String fullName = f_Name+" "+l_Name;
        String gender = "Male";
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 1200000.50;

        System.out.println("Employee' full name is: " + fullName);
        System.out.println(fullName +"' gender is: " + gender);
        System.out.println(fullName +"' age is: " + age + " years old");
        System.out.println(fullName +"' works at: " + companyName);
        System.out.println(fullName +"' Job Title is: " + jobTitle);
        System.out.println(fullName +"' salary is " + salary + " $");
        System.out.println(fullName +"' is full time employee: "+ isFullTime);
        System.out.println(fullName +"' is married: " + isMarried);



    }
}
