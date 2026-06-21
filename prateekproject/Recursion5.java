package prateekproject;

public class Recursion5 {
    public static void moveXToEnd(String str, int i, String newStr, int count) {
        if (i == str.length()) {
            for (int j = 0; j < count; j++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(i);
        if (currChar == 'x') {
            count++;
            moveXToEnd(str, i + 1, newStr, count);
        } else {
            newStr += currChar;
            moveXToEnd(str, i + 1, newStr, count);
        }
    }

    public static void main(String[] args) {
        String str = "axxbxcd";
        moveXToEnd(str, 0, "", 0);
    }
}
