package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};

        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max item in remainign array and swap with correct index
            int last= arr.length-i-1;
            int maxIndex= getMaxIndex(arr, 0, last);
            swap(arr,maxIndex,last);
        }

    }

    static void swap(int[] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int largest=start;
        for (int j = start; j < last; j++) {
            if (arr[j]>arr[largest]){
                largest=j;
            }
        }
        return largest;
    }
}
