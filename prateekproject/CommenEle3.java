//in this,the duplicate element of arrays are first remove and then find the commen element
import java.util.HashSet;

public class CommenEle3 {
    public static void main(String[] args) {
        int arr1[]={4,6,7,8,6,9,37,7,544,5,4,6,6,6,4,};
        int arr2[]={6,5,4,3,21,7,8};
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int no:arr1){
            hs1.add(no);
        }
        for(int no:arr2){
            hs2.add(no);
        }
        for(int no:hs2){
            boolean b=hs1.add(no);
            if(b==false){
                System.out.print(no+" ");
            }
        }


    }
}
