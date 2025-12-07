public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,4,5,7,8,9};
        int item=1;
        int temp=0;
        int li=arr[0];
        int hi=arr.length;int mi=(hi+li)/2;
                if(arr[mi]==item){
            System.out.println("item is at "+mi+" index position");
            temp=temp+1;
        }else if (arr[mi]<item) {
            li=mi+1;          
        }else{
            hi=mi-1;
        }
        if(temp==0){
            System.out.println("it is not in index");
        }
        mi=(hi+li)/2;

        }

    }

