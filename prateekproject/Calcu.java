package prateekproject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first number");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number");
            int num2 = scanner.nextInt();
            System.out.println("Select symbol (+, -, *, /)");
            String symbol = scanner.next();
            int result;
            switch (symbol) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Addition: " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Subtraction: " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Multiplication: " + result);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero");
                        break;
                    }
                    result = num1 / num2;
                    System.out.println("Division: " + result);
                    break;
                default:
                    System.out.println("Invalid operator: " + symbol + ". Please use +, -, *, or /");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
