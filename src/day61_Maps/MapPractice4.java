package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice4 {
/**
 * Create a MAP that contain 5 country name and 5 city name
 * Then print country Name is: pass country name, capital city is: city name
 */
    public static void main(String[] args) {
        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("England", "London");
        countries.put("Germany", "Berlin");
        countries.put("Norway", "Oslo");
        countries.put("USA", "Washington DC");

        for (Map.Entry<String, String> countryCapitalEntry : countries.entrySet()) {
            System.out.println("Country name is: "+countryCapitalEntry.getKey() +
                    ", and their capital city is: "+countryCapitalEntry.getValue());
        }
    }
}
