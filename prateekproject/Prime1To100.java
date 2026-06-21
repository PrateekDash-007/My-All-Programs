package prateekproject;

public class Prime1To100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int divisorCount = 0;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }
            if (divisorCount == 0) {
                System.out.println(i);
            }
        }
    }
}
