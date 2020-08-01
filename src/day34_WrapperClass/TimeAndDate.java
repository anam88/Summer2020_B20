package day34_WrapperClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//warm up task
public class TimeAndDate {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime rNow = LocalDateTime.now();
        System.out.println(rNow);
        //2020-07-26T09:31:32.917
        System.out.println(rNow.format(dtf));
        //Sunday, 09:31 AM, Jul/26/2020
    }
}
