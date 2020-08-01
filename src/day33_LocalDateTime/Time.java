package day33_LocalDateTime;

import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {

        LocalTime t = LocalTime.of(15,45,55);
            System.out.println(t);

        LocalTime t2 = LocalTime.now();
        System.out.println(t2);
    }
}
