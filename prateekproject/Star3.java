public class Star3 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            PatternUtils.printStars(i);
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            PatternUtils.printStars(5-i+1);
            System.out.println();
        }
    }
}
