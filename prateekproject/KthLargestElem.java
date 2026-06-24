import java.util.InputMismatchException;
import java.util.*;
public class KthLargestElem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter your number up to");
            int k=sc.nextInt();
            int arr[]={5,4,7,9,2,1,8,3};
            if(k<=0 || k>arr.length){
                System.out.println("Error: k must be between 1 and "+arr.length);
                return;
            }
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]<arr[j]){
                        ArrayUtils.swap(arr, i, j);
                    }
                }
                if(i==k-1){
                    System.out.println(k+" largest element is:"+arr[i]);
                }
            }
            ArrayUtils.printArray(arr);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}
