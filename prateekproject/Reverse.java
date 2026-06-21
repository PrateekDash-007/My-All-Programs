package prateekproject;

public class Reverse {
    public static void main(String[] args) {
        int number = 5432;
        int remainder, reversed = 0;
        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reversed);
    }
}
