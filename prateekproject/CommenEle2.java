//in this,only use of HashSet 
import java.util.HashSet;

public class CommenEle2 {
    public static void main(String[] args) {
        int []arr1={3,5,4,2,6,6,8};
        int []arr2={4,3,1,7,5,9};
        HashSet<Integer> hs=new HashSet<>();
        for(int no:arr1){
            hs.add(no);
        }
        for(int no:arr2){
            boolean b=hs.add(no);
        if(b==false){
            System.out.print(no+" ");
        }

    }
}
}
