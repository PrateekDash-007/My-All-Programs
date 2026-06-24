public class Str4 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            PatternUtils.printSpaces(n-i);
            PatternUtils.printStars(i);
            System.out.println();
        }
    }
}
