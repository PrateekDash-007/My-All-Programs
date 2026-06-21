package com.prateek.algorithms;

public class SearchingAlgorithms {

    public static int linearSearch(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int item) {
        int li = 0;
        int hi = arr.length - 1;
        while (li <= hi) {
            int mi = (hi + li) / 2;
            if (arr[mi] == item) {
                return mi;
            } else if (arr[mi] < item) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
        }
        return -1;
    }
}
