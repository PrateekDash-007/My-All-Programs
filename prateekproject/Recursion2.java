package prateekproject;

public class Recursion2 {
    public static void printPower(int n, int x) {
        if (x == 0 || n == 0) {
            return;
        }
        double prevPower = Math.pow(x, n - 1);
        double power = x * prevPower;
        System.out.println(power);
    }

    public static void main(String[] args) {
        printPower(5, 2);
    }
}
