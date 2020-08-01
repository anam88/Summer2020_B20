package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {

    public static void main(String[] args) {
        //using a loop try to print classmate DOB by using DateTimeFormatter
        String[] students = {"Kalbinur", "Virginia", "Truba", "Odina", "Ernis"};
        LocalDate[] birthDay = {
                LocalDate.of(1982, 12, 26),
                LocalDate.of(1993, 11, 25),
                LocalDate.of(1980, 5,23),
                LocalDate.of(1990,2,21),
                LocalDate.of(1982,11,28)
        };

        //Format: Odina : May/23/80 Monday

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM-dd-yy EEEE");
        for(int i = 0; i <= students.length-1; i++){
            System.out.println("Student name is: "+students[i]
                    +" and their DOB is "+ birthDay[i].format(dateFormat));
        }


    }
}
