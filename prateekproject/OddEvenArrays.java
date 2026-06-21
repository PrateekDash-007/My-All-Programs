package prateekproject;

import java.util.ArrayList;

public class OddEvenArrays {
    public static void main(String[] args) {
        int arr[] = {8, 5, 10, 12, 1, 3, 4};
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenList.add(arr[i]);
            } else {
                oddList.add(arr[i]);
            }
        }
        int evenSum = 0;
        System.out.println("even numbers are:");
        for (int no : evenList) {
            evenSum = evenSum + no;
            System.out.print(no + " ");
        }
        System.out.println("\ntotal count of even numbers: " + evenList.size());
        System.out.println("sum of all even numbers: " + evenSum);
        System.out.println("---------------------------------");
        int oddSum = 0;
        System.out.println("odd numbers are:");
        for (int no : oddList) {
            oddSum = oddSum + no;
            System.out.print(no + " ");
        }
        System.out.println("\ntotal count of odd numbers: " + oddList.size());
        System.out.println("sum of all odd numbers: " + oddSum);
    }
}
