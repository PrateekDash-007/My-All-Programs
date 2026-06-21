public class Prime1To100 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(MathUtils.isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
