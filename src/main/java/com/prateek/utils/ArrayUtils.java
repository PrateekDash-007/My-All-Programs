package com.prateek.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayUtils {

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMissingElement(int[] arr) {
        int xor1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor1 = xor1 ^ arr[i];
        }
        int xor2 = 1;
        for (int i = 2; i <= arr.length + 1; i++) {
            xor2 = xor2 ^ i;
        }
        return xor1 ^ xor2;
    }

    public static int findElementAppearsOnce(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }

    public static int longestConsecutiveSequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int num : arr) {
            hs.add(num);
        }
        int longestLength = 0;
        for (int num : arr) {
            if (!hs.contains(num - 1)) {
                int currentNum = num;
                while (hs.contains(currentNum)) {
                    currentNum++;
                }
                int currentLength = currentNum - num;
                if (longestLength < currentLength) {
                    longestLength = currentLength;
                }
            }
        }
        return longestLength;
    }

    public static int kthLargest(int[] input, int k) {
        if (input == null || input.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        if (k <= 0 || k > input.length) {
            throw new IllegalArgumentException("k must be between 1 and array length");
        }
        int[] arr = input.clone();
        // Sort descending
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[k - 1];
    }

    public static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result.add(arr1[i]);
                    break;
                }
            }
        }
        return result;
    }

    public static List<Integer> filterEven(int[] arr) {
        List<Integer> evens = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    public static List<Integer> filterOdd(int[] arr) {
        List<Integer> odds = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 != 0) {
                odds.add(num);
            }
        }
        return odds;
    }
}
