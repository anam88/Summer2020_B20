package day61_Maps;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class IteratingKeysValues {
    public static void main(String[] args) {
        Map<String, LocalDate> students = new TreeMap<>(); //TreeMap Sort the Key
        students.put("Anam", LocalDate.of(1985,4,4));
        students.put("Muhtar",LocalDate.of(1985,5,19));
        students.put("Jesus",LocalDate.of(1979,1,31));
        students.put("Muhtar",LocalDate.of(1985,6,19));
        students.put("John",LocalDate.of(1999,3,4));
        /**
         * in the above map data with key Muhtar is duplicated, and value is different
         * Than the last updated value(latest value) get's executed
         */
        System.out.println("students = " + students);
        //eachStudent represent each student in the Map
        //keySet() will get all the keys from the map
        for (String eachStudent : students.keySet()) {
            System.out.println("eachStudent = " + eachStudent);
        }
        System.out.println("******************");
        for (LocalDate eachValue : students.values()) {
            System.out.println("eachValue = " + eachValue);
        }
    }
}
