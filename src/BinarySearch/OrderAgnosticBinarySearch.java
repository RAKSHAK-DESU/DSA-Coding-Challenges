package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={-32,-18,-9,0,1,2,3,5,56,76,344,877,3444,23232};
        int target=3444;
        int ans=orderAgnosticBinarySearch( arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length -1;
        //find wether the array is sorted in ascending or descing order
        boolean isAsc;
        if(arr[start]>arr[end]){
            isAsc=false;
        }else {
            isAsc=true;
        }
        while (start<=end){
            int middle=start+(end-start)/2;

            if (arr[middle]==target){
                return middle;
            }

            if (isAsc){
            if(target<arr[middle]){
                end=middle-1;
            } else if (target>arr[middle]) {
                start=middle+1;
            }
            }
            else {
                if(target>arr[middle]){
                    end=middle-1;
                } else if (target<arr[middle]) {
                    start=middle+1;
                }
            }
        }
        return -1;
    }
}
