package prateekproject;

import java.util.HashSet;

public class FirstDuplicateHashTable {
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 1, 2, 4};
        int firstDupIdx = -1;
        HashSet<Integer> seen = new HashSet<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (seen.contains(arr[i])) {
                firstDupIdx = i;
            } else {
                seen.add(arr[i]);
            }
        }
        if (firstDupIdx != -1) {
            System.out.println("First duplicate element is: " + arr[firstDupIdx]);
        } else {
            System.out.println("There is no duplicate value");
        }
    }
}
