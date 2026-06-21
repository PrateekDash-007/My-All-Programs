public class AdvRecursion2 {
    public static int countPath(int i,int j,int m,int n){
        if(i==m||j==n){
            return 0;
        }
        if(i==m-1||j==n-1){
            return 1;
        }

        int moveDown =countPath(i+1, j, m, n);
        int moveRight=countPath(i, j+1, m, n);
        int totalcount=moveDown+moveRight;
        return totalcount;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(countPath(0, 0, m, n));
    }
}
