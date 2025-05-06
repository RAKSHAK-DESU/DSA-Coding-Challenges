package BinarySearch;

public class SearchInMountain {
    public static void main(String[] args){

    }
    static int Search(int[] arr, int target){
        int peak= peakMountainIndex(arr);
        int firstTry= orderAgnosticBinarySearch(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
    }
    static int peakMountainIndex(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        return start;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start , int end){

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
