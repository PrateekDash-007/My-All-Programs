public class ElementAppearsOnce {
    public static void main(String[] args) {
        int arr[]={3,4,5,2,4,3,5};
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=res^arr[i];
        }
        System.out.println("Single separeted element is = "+res);
        }
}
