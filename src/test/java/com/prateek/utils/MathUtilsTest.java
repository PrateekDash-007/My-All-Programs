package com.prateek.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    // Factorial tests
    @Test
    @DisplayName("Factorial - factorial of 0 is 1")
    void factorialOfZero() {
        assertEquals(1, MathUtils.factorial(0));
    }

    @Test
    @DisplayName("Factorial - factorial of 1 is 1")
    void factorialOfOne() {
        assertEquals(1, MathUtils.factorial(1));
    }

    @Test
    @DisplayName("Factorial - factorial of 5 is 120")
    void factorialOfFive() {
        assertEquals(120, MathUtils.factorial(5));
    }

    @Test
    @DisplayName("Factorial - factorial of 10")
    void factorialOfTen() {
        assertEquals(3628800, MathUtils.factorial(10));
    }

    @Test
    @DisplayName("Factorial - negative number throws exception")
    void factorialNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-1));
    }

    // Fibonacci tests
    @Test
    @DisplayName("Fibonacci - first 10 numbers")
    void fibonacciFirst10() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        assertArrayEquals(expected, MathUtils.fibonacci(10));
    }

    @Test
    @DisplayName("Fibonacci - count of 0 returns empty")
    void fibonacciZeroCount() {
        assertArrayEquals(new int[0], MathUtils.fibonacci(0));
    }

    @Test
    @DisplayName("Fibonacci - count of 1 returns [0]")
    void fibonacciOneCount() {
        assertArrayEquals(new int[]{0}, MathUtils.fibonacci(1));
    }

    @Test
    @DisplayName("Fibonacci - count of 2 returns [0, 1]")
    void fibonacciTwoCount() {
        assertArrayEquals(new int[]{0, 1}, MathUtils.fibonacci(2));
    }

    // isPrime tests
    @Test
    @DisplayName("isPrime - 2 is prime")
    void isPrime2() {
        assertTrue(MathUtils.isPrime(2));
    }

    @Test
    @DisplayName("isPrime - 7 is prime")
    void isPrime7() {
        assertTrue(MathUtils.isPrime(7));
    }

    @Test
    @DisplayName("isPrime - 1 is not prime")
    void isPrime1() {
        assertFalse(MathUtils.isPrime(1));
    }

    @Test
    @DisplayName("isPrime - 4 is not prime")
    void isPrime4() {
        assertFalse(MathUtils.isPrime(4));
    }

    @Test
    @DisplayName("isPrime - 0 is not prime")
    void isPrime0() {
        assertFalse(MathUtils.isPrime(0));
    }

    @Test
    @DisplayName("isPrime - negative number is not prime")
    void isPrimeNegative() {
        assertFalse(MathUtils.isPrime(-5));
    }

    @Test
    @DisplayName("isPrime - large prime 97")
    void isPrime97() {
        assertTrue(MathUtils.isPrime(97));
    }

    @Test
    @DisplayName("isPrime - composite number 100")
    void isPrime100() {
        assertFalse(MathUtils.isPrime(100));
    }

    // primesUpTo tests
    @Test
    @DisplayName("primesUpTo - primes up to 20")
    void primesUpTo20() {
        List<Integer> expected = List.of(2, 3, 5, 7, 11, 13, 17, 19);
        assertEquals(expected, MathUtils.primesUpTo(20));
    }

    @Test
    @DisplayName("primesUpTo - primes up to 1 is empty")
    void primesUpTo1() {
        assertTrue(MathUtils.primesUpTo(1).isEmpty());
    }

    // reverseNumber tests
    @Test
    @DisplayName("reverseNumber - 5432 reverses to 2345")
    void reverseNumber5432() {
        assertEquals(2345, MathUtils.reverseNumber(5432));
    }

    @Test
    @DisplayName("reverseNumber - 1000 reverses to 1")
    void reverseNumber1000() {
        assertEquals(1, MathUtils.reverseNumber(1000));
    }

    @Test
    @DisplayName("reverseNumber - single digit stays same")
    void reverseNumberSingleDigit() {
        assertEquals(7, MathUtils.reverseNumber(7));
    }

    @Test
    @DisplayName("reverseNumber - 0 reverses to 0")
    void reverseNumberZero() {
        assertEquals(0, MathUtils.reverseNumber(0));
    }

    @Test
    @DisplayName("reverseNumber - negative number")
    void reverseNumberNegative() {
        assertEquals(-321, MathUtils.reverseNumber(-123));
    }

    // isLeapYear tests
    @Test
    @DisplayName("isLeapYear - 2016 is a leap year")
    void isLeapYear2016() {
        assertTrue(MathUtils.isLeapYear(2016));
    }

    @Test
    @DisplayName("isLeapYear - 2000 is a leap year (divisible by 400)")
    void isLeapYear2000() {
        assertTrue(MathUtils.isLeapYear(2000));
    }

    @Test
    @DisplayName("isLeapYear - 1900 is not a leap year (divisible by 100 not 400)")
    void isLeapYear1900() {
        assertFalse(MathUtils.isLeapYear(1900));
    }

    @Test
    @DisplayName("isLeapYear - 2023 is not a leap year")
    void isLeapYear2023() {
        assertFalse(MathUtils.isLeapYear(2023));
    }

    @Test
    @DisplayName("isLeapYear - 2024 is a leap year")
    void isLeapYear2024() {
        assertTrue(MathUtils.isLeapYear(2024));
    }

    // isNumericPalindrome tests
    @Test
    @DisplayName("isNumericPalindrome - 121 is a palindrome")
    void isPalindrome121() {
        assertTrue(MathUtils.isNumericPalindrome(121));
    }

    @Test
    @DisplayName("isNumericPalindrome - 123 is not a palindrome")
    void isPalindrome123() {
        assertFalse(MathUtils.isNumericPalindrome(123));
    }

    @Test
    @DisplayName("isNumericPalindrome - single digit is palindrome")
    void isPalindromeSingleDigit() {
        assertTrue(MathUtils.isNumericPalindrome(5));
    }

    @Test
    @DisplayName("isNumericPalindrome - 0 is palindrome")
    void isPalindromeZero() {
        assertTrue(MathUtils.isNumericPalindrome(0));
    }

    @Test
    @DisplayName("isNumericPalindrome - 12321 is a palindrome")
    void isPalindrome12321() {
        assertTrue(MathUtils.isNumericPalindrome(12321));
    }
}
