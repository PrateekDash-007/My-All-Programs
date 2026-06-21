public class Delete_An_Ele {
    public static void main(String[] args) {
        int a[]={1,2,3,5,6,7};
        int delele=3;
        for(int i=0;i<a.length;i++){
            if(delele==a[i]){
             for(int j=i;j<a.length-1;j++){
                 a[j]=a[j+1];

             }
             break;
            }

          
        
    }
    for(int i=0;i<a.length-1;i++){
        System.out.print(a[i]+"  ");
    }
    }

}

