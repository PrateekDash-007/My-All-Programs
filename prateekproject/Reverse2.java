package prateekproject;

import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            int length = name.length();
            if (length == 0) {
                System.out.println("Error: Empty input provided");
                return;
            }
            String reversed = "";
            for (int i = length - 1; i >= 0; i--) {
                reversed = reversed + name.charAt(i);
            }
            System.out.println(reversed);
        } finally {
            scanner.close();
        }
    }
}
