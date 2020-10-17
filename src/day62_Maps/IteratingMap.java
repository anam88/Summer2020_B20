package day62_Maps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {
        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John",LocalDate.of(1999,8,9));
        map.put("Aaron",LocalDate.of(1988,8,9));
        map.put("Daniel",LocalDate.of(1999,5,9));
        map.put("Caleb",LocalDate.of(1999,8,10));
        map.put("Erik",LocalDate.of(1990,8,9));
        System.out.println("map = " + map);
//get all the Keys
        for (String eachKey : map.keySet()) {
            System.out.println("eachKey = " + eachKey);
        }
/**because the maps do not have index number, therefore we add the map in to the list
  so we can print a specfic person information using index # */
        List<String> names = new ArrayList<>( map.keySet());
        System.out.println("names = " + names);
        System.out.println("names = " + names.get(1));

        System.out.println("*******************************************************");
//get all the values
        for (LocalDate eachvalue : map.values()) {
            System.out.println("eachvalue = " + eachvalue);
        }
        List<LocalDate> dateOfBirth = new ArrayList<>(map.values());
        System.out.println("dateOfBirth of Aaron = " + dateOfBirth.get(1));
        System.out.println("*******************************************************");
//entrySet
        for (Map.Entry<String, LocalDate> eachNameDateOfBirthEntry : map.entrySet()) {
            System.out.println(eachNameDateOfBirthEntry.getKey()+" : "+
                    eachNameDateOfBirthEntry.getValue());
        }
    }

}
