public class FirstDuplicateEle {
    public static void main(String[] args) {
        int arr[]={6,5,3,2,5,1,6,2,4};
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The First duplicate element is:"+arr[i]);
                    temp=temp+1;
                    break;
                }
            }
            if(temp>0){
                break;
            }
        }       
    }
}
