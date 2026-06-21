package prateekproject;

public class ElementAppearsOnce {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 2, 4, 3, 5};
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        System.out.println("Unique element is = " + result);
    }
}
