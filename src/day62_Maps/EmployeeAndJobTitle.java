package day62_Maps;

import java.util.*;

/**
 *  1. create 3 LinkedHashMaps that contains employee name and jobTitle
 * 2. create a List of Map and store all LinkedHashMaps objects into the list.
 * 3. Iterate each objects from the list and print out the name of the employee
 * if the jobTitle of the employee is SDET
 */
public class EmployeeAndJobTitle {
    public static void main(String[] args) {
        Map<String,String> team1 = new LinkedHashMap<>();
        team1.put("Azat","Senior SoftwareDeveloper");
        team1.put("Nurahmet","SDET");
        team1.put("Arman","QA");
        team1.put("Abide","SDET");
        team1.put("Jeniffer","BA");

        Map<String, String> team2 = new LinkedHashMap<>();
        team2.put("Muhtar","Senior SoftwareDeveloper");
        team2.put("Fatime M","SDET");
        team2.put("Arzu","QA");
        team2.put("Bahtiyar","SDET");
        team2.put("Romina","BA");

        Map<String, String> team3 = new LinkedHashMap<>();
        team3.put("Hajar", "Developer");
        team3.put("Dania", "SDET");
        team3.put("Rani", "PO");
        team3.put("Jak", "SM");
        team3.put("Michel", "SDET");

        List<Map<String, String>> projectTeams =
                new ArrayList<>(Arrays.asList(team1, team2, team3));

        for (Map<String, String> eachprojectTeam : projectTeams) {
           // System.out.println("eachprojectTeam = " + eachprojectTeam);
            for(Map.Entry<String, String> eachTeam : eachprojectTeam.entrySet()){
                String name = eachTeam.getKey();
                String jobTitle = eachTeam.getValue();
                if(jobTitle.equals("SDET")){
                    System.out.println(name);
                }
            }

        }
        
    }
}
