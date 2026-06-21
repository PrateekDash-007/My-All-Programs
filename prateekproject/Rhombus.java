public class Rhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            PatternUtils.printSpaces(n-i);
            PatternUtils.printStars(5);
            System.out.println();
        }
    }
}
