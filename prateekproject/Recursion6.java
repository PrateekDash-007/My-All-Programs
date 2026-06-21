package prateekproject;

public class Recursion6 {
    static boolean[] visited = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (visited[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newStr);
        } else {
            newStr += currChar;
            visited[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "abbcdde";
        removeDuplicates(str, 0, "");
    }
}
