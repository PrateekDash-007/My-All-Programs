public class MaximaMinima {
    public static void main(String[] args) {
        int arr[]={6,5,9,2,4};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
           max=arr[i];
            }
            
        }  
        int min=arr[0];
           
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
           min=arr[i];
    }
        }
        System.out.println("min is:"+min);  
      System.out.println("max is:"+max);       
    }
   
}
