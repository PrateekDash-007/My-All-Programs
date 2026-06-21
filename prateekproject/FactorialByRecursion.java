package prateekproject;

public class FactorialByRecursion {
    int calcFact(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers: " + num);
        }
        if (num == 0 || num == 1) {
            return 1; //base case
        } else {
            return num * calcFact(num - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        FactorialByRecursion obj = new FactorialByRecursion();
        try {
            int fact = obj.calcFact(num);
            System.out.println("factorial of " + num + " is " + fact);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
