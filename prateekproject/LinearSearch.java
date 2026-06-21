package prateekproject;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 1, 4, 2};

        int item = 9;
        int found = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println("item is present at " + i + " index position");
                found++;
            }
        }
        if (found == 0) {
            System.out.println("item is not present");
        }
    }
}
