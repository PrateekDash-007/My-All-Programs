import java.util.*;
public class KthLargestElem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number up to");
        int k=sc.nextInt();      
        int temp;
        int arr[]={5,4,7,9,2,1,8,3};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(k+" largest element is:"+arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
