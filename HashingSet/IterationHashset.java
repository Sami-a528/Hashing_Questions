package HashingSet;

import java.util.HashSet;
import java.util.Iterator;

public class IterationHashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Patna");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bettiah");

        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
        // By For each loop
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
