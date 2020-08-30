package day48_Inheritance.EmployeeTask;

public class EmployeeObject {
    public static void main(String[] args) {
        System.out.println("Bank of America hired two new Employees");
        Tester newTester = new Tester("Anam",4789,"Senior QA",165000,
                'F');
        System.out.println(newTester);
        newTester.findingBugs();
        newTester.smokeTesting();
        System.out.println("********************************");
        Developer newDeveloper = new Developer("Luisa",4786,
                "Back-End Developer",172999,'F');
        System.out.println(newDeveloper);
        newDeveloper.fixingBugs();


    }
}
