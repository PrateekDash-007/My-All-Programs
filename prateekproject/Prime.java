package prateekproject;

public class Prime {
    public static void main(String[] args) {
        int num = 7;
        int divisorCount = 0;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                divisorCount++;
            }
        }
        if (divisorCount == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
