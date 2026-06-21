public class Num9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            PatternUtils.printStars(i);
            PatternUtils.printSpaces(2*(n-i));
            PatternUtils.printStars(i);
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            PatternUtils.printStars(i);
            PatternUtils.printSpaces(2*(n-i));
            PatternUtils.printStars(i);
            System.out.println();
        }
    }
}
