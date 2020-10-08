package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * create a MAP that contain student name and score
 * Then Put 5 of your classmates names and their score
 * if the student score is >= 95 add them to earlyBirds
 * else add the student to angryBirds
 * Print their names
 */
public class MapPractice3 {
    public static void main(String[] args) {
        Map<String, Integer> students = new LinkedHashMap<>();
        students.put("John",85);
        students.put("Bob",90);
        students.put("Lewis",64);
        students.put("Anna",70);
        students.put("Hannah",50);
        students.put("Hanna",94);
        students.put("Jesus",74);
        students.put("Elmira",97);
        students.put("Ali",92);
        students.put("Mikri",95);
        System.out.println("scores = " + students);

        LinkedHashMap<String, Integer> earlyBirds = new LinkedHashMap<>(); //score >=95
        LinkedHashMap<String, Integer> angryBirds = new LinkedHashMap<>(); //score < 95

        for (String eachKey : students.keySet()) {
            Integer eachValue = students.get(eachKey);

            if(eachValue >= 95){
                earlyBirds.put(eachKey, eachValue);
            }else{
                angryBirds.put(eachKey,eachValue);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds.keySet());
        System.out.println("angryBirds = " + angryBirds.keySet());
    }
}
