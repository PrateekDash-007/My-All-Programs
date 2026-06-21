package prateekproject;

//in this, the duplicate elements of arrays are first removed and then find the common elements
import java.util.HashSet;

public class CommonElement3 {
    public static void main(String[] args) {
        int arr1[] = {4, 6, 7, 8, 6, 9, 37, 7, 544, 5, 4, 6, 6, 6, 4};
        int arr2[] = {6, 5, 4, 3, 21, 7, 8};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int no : arr1) {
            set1.add(no);
        }
        for (int no : arr2) {
            set2.add(no);
        }
        for (int no : set2) {
            boolean added = set1.add(no);
            if (added == false) {
                System.out.print(no + " ");
            }
        }
    }
}
