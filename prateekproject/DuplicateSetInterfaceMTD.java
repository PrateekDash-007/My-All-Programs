import java.util.HashSet;
import java.util.Set;
public class DuplicateSetInterfaceMTD {
    public static void main(String[] args) {
        int arr[]={3,5,4,3,2,2,1,5,7,9,3,3,3};
        System.out.println("Duplicate numbers are:");

        Set<Integer> s=new HashSet<>();
        for(int no:arr){
            boolean b=s.add(no);
            if(b==false){
                   System.out.print(no+" ");
            }
        }
        
    }
}
