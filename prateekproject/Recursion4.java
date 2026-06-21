package prateekproject;

public class Recursion4 {

    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 9, 6, 7, 8, 9};
        System.out.print(isSorted(arr, 0));
    }
}
