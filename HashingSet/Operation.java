package HashingSet;

import java.util.HashSet;

public class Operation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(4);
        System.out.println("Set is= " + set);
        System.out.println("Set Size = " + set.size());
        System.out.println("is Set Empty = " + set.isEmpty());

        if(set.contains(2)){
            System.out.println("Set Contains 2");
        }else{
            System.out.println("Set not Contains 2");
        }
        set.remove(2);
        if(set.contains(2)){
            System.out.println("Set Contains 2");
        }else{
            System.out.println("Set not Contains 2");
        }


        if(set.contains(5)){
            System.out.println("Set Contains 5");
        }else{
            System.out.println("Set not Contains 5");
        }


        set.clear();
        System.out.println("Set is = " + set);
        System.out.println("Set size = " + set.size());
        System.out.println("is Set Empty = " + set.isEmpty());
        
    }
}
