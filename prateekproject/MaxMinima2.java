public class MaxMinima2 {
    public static void main(String[] args) {
        int arr[]={3,8,6,2,5,4};
        SortUtils.sortDescending(arr);
        System.out.println("the second largest element is: "+arr[1]);
        SortUtils.sortAscending(arr);
        System.out.println("the second smallest element is: "+arr[1]);
    }
}
