package HashingSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHasSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Patna");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bettiah");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Patna");
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Bettiah");
        System.out.println(lhs);
    }
}
