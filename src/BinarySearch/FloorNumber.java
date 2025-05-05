package BinarySearch;

import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,110,121,434,874};
        int target=111;
        System.out.println(Floor(arr,target));

    }
    static int Floor(int arr[], int target){
        int start=0;
        int end= arr.length-1;

        while (start<=end){
            int middle= start+(end-start)/2;

            if (target<arr[middle]){
                end=middle-1;
            } else if (target>arr[middle]) {
                start=middle+1;
            }else {
               return middle;
            }

        }
        return end;
    }

}
