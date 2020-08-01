package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Practice1 {
    public static void main(String[] args) {
        String[] students = {"Kalbinur", "Virginia", "Truba", "Odina", "Ernis"};
        LocalDate[] birthDay = {
                LocalDate.of(1982, 12, 26),
                LocalDate.of(1993, 11, 25),
                LocalDate.of(1980, 5,23),
                LocalDate.of(1990,2,21),
                LocalDate.of(1982,11,28)
                   };

        for(int i = 0; i <= students.length-1; i++){
            System.out.println(students[i]+" : "+birthDay[i]);
        }
        System.out.println("============================================");
        //print leap year only
        for(LocalDate each : birthDay){
            if(!each.isLeapYear()){
                continue;
            }
            System.out.println(each);
        }
        System.out.println("============================================");

        LocalDateTime dt = LocalDateTime.of(2020,07,25, 13,20);
        System.out.println(dt);

        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(dt1);
    }
}