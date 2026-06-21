package prateekproject;

public class Generic2 {
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }

    public static <T> boolean findElement(T[] arr, T item) {
        for (T element : arr) {
            if (element.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5, 6};
        printArray(arr1);
        System.out.println(findElement(arr1, 3));
        String arr2[] = {"Nimesh", "sinay", "Prateek"};
        printArray(arr2);
        System.out.println(findElement(arr2, "sinay"));
    }
}
