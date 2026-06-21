public class Exception2{
 public static void main(String[] args) {
    int a[]={1,2,3,4,5,6};
    int b[]={12,3,0,75,3,6};
    try{
        for(int i=0;i<a.length;i++){
      int c=a[i]/b[i];
        }

    }catch(Exception e){
       System.out.println(e);
        System.out.println("nohh");

    }
    finally{
        System.out.println("very goood yo got it");
    }
    
 }
}