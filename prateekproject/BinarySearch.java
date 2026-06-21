package prateekproject;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 8, 9};
        int item = 1;
        int found = 0;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == item) {
                System.out.println("item is at " + mid + " index position");
                found++;
                break;
            } else if (arr[mid] < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (found == 0) {
            System.out.println("item is not in the array");
        }
    }
}
