package prateekproject;

import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        int arr[] = {3, 9, 1, 10, 4, 20, 2};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int longestLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i] - 1)) {
                int current = arr[i];
                while (set.contains(current)) {
                    current++;
                }
                if (longestLength < current - arr[i]) {
                    longestLength = current - arr[i];
                }
            }
        }
        System.out.println("longest consecutive subsequence length is " + longestLength);
    }
}
