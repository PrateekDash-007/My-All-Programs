import java.util.HashSet;
public class FirstDuplicateHashTable {
    public static void main(String[] args) {
        int arr[]={6,5,3,2,1,2,4};
        int temp=-1;
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=arr.length-1;i>=0;i--){
            if(hs.contains(arr[i])){
                temp=i;
            }else{
                hs.add(arr[i]);
            }

        }
        if(temp!=-1){
            System.out.println("First duplicate element is:"+arr[temp]);
        }else{
            System.out.println("There is no duplicate value ");
        }
    
    }
}
