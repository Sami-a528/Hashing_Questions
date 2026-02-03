package TreeSet;

import java.util.HashMap;

public class JournyFromTickts {
    public static String GetStartPoint(HashMap<String, String> tickets) { // From -> To
        // To -> From
        HashMap<String, String> revMap = new HashMap<>();
        for (String key  : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }
        for (String key  : tickets.keySet()) {
            if(!revMap.containsKey(key)){
                return key; // Starting Point
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chenni", "Bangaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chenni");
        tickets.put("Delhi", "Goa");

        String start = GetStartPoint(tickets);
        System.out.print(start);

        for (String key : tickets.keySet()) {
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
