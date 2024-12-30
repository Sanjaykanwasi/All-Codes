import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {

        // key=counrty and value = populatiom
        HashMap<String, Integer> map = new HashMap<>();

        // Adding
        map.put("India", 130);
        map.put("China", 150);
        map.put("USA", 50);
        map.put("Pakistan", 90);

        // Printing
        System.out.println(map);

        // updating
        map.put("India", 200);
        System.out.println(map);

        // Searching
        if (map.containsKey("India")) {
            System.out.println("True");
        }

        // Get the value of a key
        System.out.println(map.get("China"));
        System.out.println(map.get("Czech"));

        // Iteration = In this we are creating a set and then storing value in e
        // for each loop for(int value : arr)
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Another method
        Set<String> keys = map.keySet();
        for (String e : keys) {
            System.out.println(e + " " + map.get(e));
        }

        // Removing
        map.remove("Pakistan");
    }
}
