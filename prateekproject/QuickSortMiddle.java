public class QuickSortMiddle {
    public static void main(String[] args) {
        int[]arr={15,9,7,13,12,16,14,18,11};
        int leng=arr.length;

        QuickSortMiddle qms=new QuickSortMiddle();
        qms.quickSortRecursion(arr,0,leng-1);
        ArrayUtils.printArray(arr);
    }
    int partition (int[]arr,int low,int high)
    {
        int pivot=arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivot)
            {
                low++;
            }
            while(arr[high]>pivot)
            {
                high--;
            }
            if(low<=high){
                ArrayUtils.swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }
    void quickSortRecursion(int[]arr,int low,int high){
        int pi=partition(arr,low,high);
        if(low<pi-1){
            quickSortRecursion(arr, low, pi-1);
        }
        if(pi<high){
            quickSortRecursion(arr, pi, high);
        }
    }
}
