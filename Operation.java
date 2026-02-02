import java.util.HashMap;

public class Operation {
    public static void main(String[] args) {
        // Create HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm);

        //Get
        int Population = hm.get("India");
        System.out.println(Population);
        System.out.println(hm.get("Indonesia")); // Null

        // containsKey
        System.out.println(hm.containsKey("India")); // True
        System.out.println(hm.containsKey("Indonesia")); // False
        
        //Remove
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        //size
        System.out.println(hm.size()); // 3

        // isEmpty
        System.out.println(hm.isEmpty()); // false

        // Clear
        hm.clear();
        System.out.println(hm.isEmpty()); // true
        System.out.println(hm.size()); // 0
    }
}