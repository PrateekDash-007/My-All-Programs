public class StrDimond {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            PatternUtils.printSpaces(n-i);
            PatternUtils.printStars(2*(i-1));
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            PatternUtils.printSpaces(n-i);
            PatternUtils.printStars(2*(i-1));
            System.out.println();
        }
    }
}
