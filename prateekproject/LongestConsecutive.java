import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
       int arr[]={3,9,1,10,4,20,2};
       HashSet<Integer>hs=new HashSet<>();
       for(int i=0;i<arr.length;i++){
        hs.add(arr[i]);
       } 
       int long_leng=0;
       for(int i=0;i<arr.length;i++){
        if(!hs.contains(arr[i]-1)){
            int no=arr[i];
            while(hs.contains(no)){
                  no++;
            }
            if(long_leng<no-arr[i]){
                long_leng=no-arr[i];
            }
        }
       }
       System.out.println("longest sub seq length is "+long_leng);
    }

}
