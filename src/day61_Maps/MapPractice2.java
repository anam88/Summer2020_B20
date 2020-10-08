package day61_Maps;

import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * TASK 1: create a MAP that contain student name and score
 * Put 5 of your classmates names and their score
 * Then print out the name of students whose score is less than 80
 */
public class MapPractice2 {
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

        //second approach
        for(Map.Entry<String, Integer> stringIntegerEntry : students.entrySet()){
            if(stringIntegerEntry.getValue() < 80){
                System.out.println("Student with the score of less than 80%: "
                        + stringIntegerEntry.getKey());
            }
        }
        //first approach
/*
        Iterator<Integer> it = students.values().iterator();
        while(it.hasNext()){
            if(it.next() > 80){
                it.remove();
            }
        }
        System.out.println(students.keySet());

 */



    }
}
