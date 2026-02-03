package TreeSet;

import java.util.HashSet;

public class Unionintrsection {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        // Union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("Union = " + set.size());
        System.out.println("Elemnt is = " + set);

        // InterSection
        set.clear();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
                System.out.println("Element is = " + arr2[i]);
            }
        }
        System.out.println("InterSection = " + count);
    }
}
