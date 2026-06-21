package prateekproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your name");
            String name = scanner.next();
            System.out.println("Enter your Gender");
            char gender = scanner.next().charAt(0);
            System.out.println("Enter your age");
            int age = scanner.nextInt();
            System.out.println("Enter your mob no.");
            long phoneNo = scanner.nextLong();
            System.out.println("name: " + name);
            System.out.println("gender: " + gender);
            System.out.println("age: " + age);
            System.out.println("phone: " + phoneNo);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Age must be an integer and phone number must be numeric.");
        } finally {
            scanner.close();
        }
    }
}
