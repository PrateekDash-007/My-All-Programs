public class DuplicateBruteForceMTD {
     public static void main(String[] args) {
        int arr[]={4,5,6,7,8,6,3,2,4,5,6};
        System.out.println("Duplicate values are:");
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]==arr[j])&& (i!=j)){
                    System.out.println(arr[j]+" ");

                }
            }
        }
        
    }
}
