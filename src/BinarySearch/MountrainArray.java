package BinarySearch;

public class MountrainArray {
    public static void main(String[] args){

    }
    static int PeakIndexinMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid= start+(end-start)/2;

            if (arr[mid]>arr[mid+1]){
                // you are in decreasing part of the array , this may be the answer , but look at left
                //this is why end!=mid-1;
                end=mid;
            } else {
                //you are in ascending part of an arry
                start=mid+1;
            }
        }
        //in the end ,start==end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks hence,
        // when they are pointing to jsut one element they are mx one
        return start;
    }


}
