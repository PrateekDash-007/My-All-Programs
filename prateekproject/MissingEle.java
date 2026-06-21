package prateekproject;

public class MissingEle {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7};

        //with XOR method
        int xor1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor1 = xor1 ^ arr[i];
        }
        int xor2 = 1;
        for (int i = 2; i <= (arr.length + 1); i++) {
            xor2 = xor2 ^ i;
        }
        System.out.println("missing element is: " + (xor1 ^ xor2));
    }
}
