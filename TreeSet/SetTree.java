package TreeSet;
import java.util.*;
public class SetTree {
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

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Patna");
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Bettiah");
        System.out.println(ts);
    }
}
