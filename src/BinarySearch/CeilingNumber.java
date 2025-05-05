package BinarySearch;

import java.util.Scanner;

public class CeilingNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target= 3;

        int result=Ceiling(arr,target);
        System.out.println(result);
    }
    static int Ceiling(int arr[] , int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int middle=start+(end-start)/2;

            if (target<arr[middle]){
                end=middle-1;
            } else if (target> arr[middle]) {
                start=middle+1;
            }else {
               return middle;
            }
        }
        return -1;
    }

}
