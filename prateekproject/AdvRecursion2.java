package prateekproject;

public class AdvRecursion2 {
    public static int countPaths(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 || j == n - 1) {
            return 1;
        }

        int moveDown = countPaths(i + 1, j, m, n);
        int moveRight = countPaths(i, j + 1, m, n);
        int totalCount = moveDown + moveRight;
        return totalCount;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(countPaths(0, 0, m, n));
    }
}
