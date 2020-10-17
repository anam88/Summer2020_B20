package day62_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class SetEntryForMap {
    public static void main(String[] args) {
        //username & password

        Map<String, String> vyTrackCredentials = new LinkedHashMap<>();
        vyTrackCredentials.put("user1","password123");
        vyTrackCredentials.put("user2","password143");
        vyTrackCredentials.put("user3","password156");
        vyTrackCredentials.put("user4","password243");
        vyTrackCredentials.put("user5","password343");
        vyTrackCredentials.put("user6","password443");
        vyTrackCredentials.put("user7","password543");
        vyTrackCredentials.put("user8","password643");
        vyTrackCredentials.put("user9","password743");
        vyTrackCredentials.put("user10","password843");

        for (Map.Entry<String, String> eachUsernamePassword : vyTrackCredentials.entrySet()) {
            String username = eachUsernamePassword.getKey();
            String password = eachUsernamePassword.getValue();
            System.out.println("Credentials Entered: "+username+" : "+password);
        }
    }
}
