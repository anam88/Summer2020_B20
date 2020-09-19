package day54_OOPAbstraction_Intro;

import java.time.LocalDate;

/*
4. create a class called PenFed
create 3 objects of Tester and Developers
try to make change to the gender & DOfB of the employees

 */
public class PenFed {
    public static void main(String[] args) {
        //objects of Tester
        Tester tester1 = new Tester("Polat Alemdar",'M',
                LocalDate.of(1973,11,20),"KABADAYI",1500000);
        Tester tester2 = new Tester("Denys", 'M',
                LocalDate.of(1988,05,07), "QA", 120000);
        System.out.println(tester1.gender);//cannot make changes in the gender as its FINAL
        System.out.println(tester1.DOfB);//cannot make change sin the DOB as its FINAL

        Developer developer1 = new Developer("Adam", 'M',
                LocalDate.of(1994,06,11), "Dev",190_000);





    }
}
