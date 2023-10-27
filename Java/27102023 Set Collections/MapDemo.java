import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        /* 
        Map<Integer, String> mp = new HashMap<>();
        mp.put(101, "Ramesh");
        mp.put(103, "Mahesh");
        mp.put(102, "Suresh");
        mp.put(105, "Bhavesh");
        mp.put(104, "Dinesh");
        // For accessing
        // System.out.println(mp);

        // Accessing through for each
        for(Integer i: mp.keySet()){
            String val = mp.get(i);
            System.out.println("Key: " + i + " Value: " + val+"ji");
        }
        */

        // LinkedHashMap
        /*
        Map<Integer, String> mp = new LinkedHashMap<>();
        mp.put(103, "Mahesh");
        mp.put(104, "Dinesh");
        mp.put(101, "Ramesh"); 
        mp.put(102, "Suresh");
        mp.put(105, "Bhavesh");

        for(Integer i: mp.keySet()){
            String val = mp.get(i);
            System.out.println("Key: " + i + " Value: " + val+"ji");
        }
        */
        


        // TreeMap
        Map<Integer, String> mp = new TreeMap<>();
        mp.put(103, "Mahesh");
        mp.put(104, "Dinesh");
        mp.put(101, "Ramesh"); 
        mp.put(102, "Suresh");
        mp.put(105, "Bhavesh");

        for(Integer i: mp.keySet()){
            String val = mp.get(i);
            System.out.println("Key: " + i + " Value: " + val+"ji");
        }
        
        for (String v : mp.values()) {
            System.out.println("Value: " + v);
        }
    }
    
}
