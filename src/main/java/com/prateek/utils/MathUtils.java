package com.prateek.utils;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int[] fibonacci(int count) {
        if (count <= 0) {
            return new int[0];
        }
        if (count == 1) {
            return new int[]{0};
        }
        int[] result = new int[count];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < count; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> primesUpTo(int limit) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static int reverseNumber(int n) {
        int rem, rev = 0;
        int num = Math.abs(n);
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return n < 0 ? -rev : rev;
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public static boolean isNumericPalindrome(int n) {
        int original = Math.abs(n);
        int reversed = reverseNumber(original);
        return original == reversed;
    }
}
