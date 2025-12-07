
import java.util.ArrayList;

public class OddEvenArrays {
    public static void main(String[] args) {
        int arr[]={8,5,10,12,1,3,4};
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                al1.add(arr[i]);

            }else{
                al2.add(arr[i]);
            }
        }
        int temp1=0;
        System.out.println("even no. are: ");
        for(int no:al1){
            temp1=temp1+no;
            System.out.print(+no+" ");
        }
        System.out.println("\ntotal no of even nos re :"+al1.size());
        System.out.println("sum of all even nos are: "+temp1);
        System.out.println("---------------------------------");
        int temp2=0;
        System.out.println("odd no. are: ");
        for(int no:al2){
            System.out.print(+no+" ");
        }
        System.out.println("\ntotal no of odd nos are: "+al2.size());
        System.out.println("sum of all odd nos are: "+temp2);
    }
}
