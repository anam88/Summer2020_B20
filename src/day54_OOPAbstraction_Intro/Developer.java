package day54_OOPAbstraction_Intro;

import java.time.LocalDate;

public final class Developer extends EmployeeTask{

    public Developer(String name, char gender, LocalDate DOfB,
                     String jobTitle, double salary){
        super(name,gender,DOfB,jobTitle,salary);
    }
}
