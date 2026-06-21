package prateekproject;

public class Recursion3 {
    static int first = -1;
    static int last = -1;

    public static void findOccurrence(int idx, String str, char ch) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == ch) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurrence(idx + 1, str, ch);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurrence(0, str, 'a');
    }
}
