public class Recursion2 {
    public static void printPower(int n,int x){
        if(x==0||n==0){
            return;
        }
        double pow_xnm1=Math.pow(x, n-1);
        double pow=x*pow_xnm1;
        System.out.println(pow);

    }
    public static void main(String[] args) {
        printPower(5, 2);
    }
}
