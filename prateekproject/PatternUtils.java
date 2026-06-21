public class PatternUtils {

    public static void printChars(char c, int count) {
        for (int j = 1; j <= count; j++) {
            System.out.print(c);
        }
    }

    public static void printSpaces(int count) {
        printChars(' ', count);
    }

    public static void printStars(int count) {
        printChars('*', count);
    }
}
