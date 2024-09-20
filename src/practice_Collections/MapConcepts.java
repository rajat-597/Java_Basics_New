package practice_Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapConcepts {

    public static void main(String[] args) {
        Map<String, String> emp = new HashMap<>();

        emp.put("101","Rajat");
        emp.put("102","Abhishek");
        emp.put("103","Sapna");
        emp.put("104", "Nitish");
        emp.put("105","Mahesh");

        System.out.println(emp); // {101=Rajat, 102=Abhishek, 103=Sapna, 104=Nitish, 105=Mahesh}

        System.out.println(emp.get("101")); // Rajat
        System.out.println(emp.isEmpty()); // false
        System.out.println(emp.containsKey("103")); // true
        System.out.println(emp.containsValue("Nitish")); // true

        Set<String> key = emp.keySet();
        for(String keys :key){
            System.out.println(keys + " " + emp.get(keys)); // 101 Rajat 102 Abhishek  .. 105 Mahesh
        }

        Collection<String> values =  emp.values();
        for(String value : values){
            System.out.print(value + " "); // Rajat Abhishek Sapna Nitish Mahesh
        }

        // entrySet return both kay and value

       Set<Map.Entry<String, String>> entries = emp.entrySet();
        for (Map.Entry<String, String > entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(emp.remove("104")); // Nitish

        System.out.println(emp); //{101=Rajat, 102=Abhishek, 103=Sapna, 105=Mahesh}
    }
}
