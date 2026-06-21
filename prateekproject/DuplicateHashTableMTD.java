package prateekproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateHashTableMTD {
    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 3, 2, 2, 1, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int no : arr) {
            Integer count = countMap.get(no);
            if (count == null) {
                countMap.put(no, 1);
            } else {
                count = count + 1;
                countMap.put(no, count);
            }
        }
        System.out.println("Duplicate elements are:");
        Set<Map.Entry<Integer, Integer>> entries = countMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
