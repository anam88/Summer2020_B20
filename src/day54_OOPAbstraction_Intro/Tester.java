package day54_OOPAbstraction_Intro;

import java.time.LocalDate;

/*
 2. create a sub class of Employee named Tester(meant to be subClass ONLY)
 */
//a final class of Tester, cannot be inherited
public final class Tester extends EmployeeTask{
    public Tester(String name, char gender, LocalDate DOfB,
                  String jobTitle, double salary){
        super(name, gender, DOfB, jobTitle, salary);

    }

}
