package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int[] arr={-32,-18,-9,0,1,2,3,5,56,76,344,877,3444,23232};
        int target=3444;
        int ans=binarySearch(arr,target);
        System.out.println(ans);

    }
    //return the index
    //return -1 if it dosent exist
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length -1;

        while (start<=end){
            int middle=start+(end-start)/2;

            if(target<arr[middle]){
                end=middle-1;
            } else if (target>arr[middle]) {
                start=middle+1;
            }else {
                return middle;
            }
        }
        return -1;

    }

}
