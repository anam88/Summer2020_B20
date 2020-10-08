package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<String, Double> employee = new LinkedHashMap<>();
                    //Key :   Value
        employee.put("Elvira",100000.0);
        employee.put("Ziiadin", 10000.0);
        employee.put("Roman", 100000.0);
        employee.put("Cihan",140000.0);
        employee.put("Nurbiya",120000.0);

        System.out.println("employee = " + employee);
        System.out.println("employee.size() = " + employee.size());

        employee.put("Anam",120000.0); //add
        System.out.println("employee = " + employee);
        System.out.println("employee.size() = " + employee.size());

        //get()method - gets the key information
        System.out.println("employee.get(\"Anam\") = " + employee.get("Anam"));
        //remove() remove key: value
        System.out.println("employee.remove(\"Ziiadin\") = " + employee.remove("Ziiadin"));
        System.out.println("employee.size() = " + employee.size());
        System.out.println("employee.isEmpty() = " + employee.isEmpty());
        //containsKey() - returns boolean
        System.out.println("employee.containsKey(\"Roman\") = " + employee.containsKey("Roman"));//true
        //containsValue() - return boolean
        System.out.println("employee.containsValue(140000.0) = " + employee.containsValue(140000.0));
        //clear() - size will become 0
        employee.clear();
        System.out.println("employee.size() = " + employee.size());//employee.size() = 0
        //empty() - returns boolean
        System.out.println("employee.isEmpty() = " + employee.isEmpty());
    }
}
