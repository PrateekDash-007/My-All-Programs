package prateekproject;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] a = {10, 100, 200, 30};
        int[] b = {1, 2, 0, 3};
        for (int i = 0; i < a.length; i++) {
            System.out.println(divide(a[i], b[i]));
        }
        System.out.println("%%^*(*&^%$%^&*(");
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
}
