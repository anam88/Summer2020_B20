package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {

    public static void main(String[] args) {
        DateTimeFormatter dateFormat =  DateTimeFormatter.ofPattern("E, MMM/dd/yyyy ");
        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println("Formatted Date "+d.format(dateFormat));

        System.out.println("=============================================");

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        System.out.println("Formatted Time "+nowTime.format((timeFormat)));

        System.out.println("=======================================");
        //May/20/2019 Dayname 4:30 pm

        DateTimeFormatter df = DateTimeFormatter.ofPattern(("MMM/dd/yyyy E, hh:mm a"));

       LocalDateTime dt1 = LocalDateTime.of(2019,5,20,16,30);
        System.out.println(dt1);
        System.out.println("Formatted Date & Time "+dt1.format(df));

        System.out.println("=======================================");
        //print Saturday 4:33:45 pm
        DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime rNow = LocalDateTime.now();
        System.out.println("Current Format: "+rNow);
        System.out.println("Formatted pattern: "+rNow.format(dt2));

    }
}
