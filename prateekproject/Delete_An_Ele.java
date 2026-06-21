package prateekproject;

public class Delete_An_Ele {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7};
        int toDelete = 3;
        for (int i = 0; i < arr.length; i++) {
            if (toDelete == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
