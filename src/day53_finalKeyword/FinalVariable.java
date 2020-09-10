package day53_finalKeyword;

import java.time.LocalDate;
/*
•	If you make any variable as final, you cannot change the value of final variable (it will be constant)
o	final static and instance variable need to be initialized right away.
o	If choose not to initialize them right away, then create a static block to initialized
 final static variable & constructor to initialized final instance variable
 */
public class FinalVariable {
    //either initlize them right away or
    final static String eyeColor = "brown"; //apply static block
    final String bloodType = "B+";//apply constructor


    public static void main(String[] args) {
        final LocalDate dateOfBirth = LocalDate.of(2020,01,9);
       // dateOfBirth = LocalDate.of(1990,6,5); dateOfBirth cannot be reassign due to final keyword


    }
}
