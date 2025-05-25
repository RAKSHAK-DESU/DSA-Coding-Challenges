package Sorting;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=0;i<nums1.length-m;i++){
            nums1[m+i]=nums2[i];
        }
        //now we have nums1

        for(int i=0;i<nums1.length;i++){

            for(int j=1;j<nums1.length;j++){
                //swap if the item is smaller than previous item
                if(nums1[j]<nums1[j-1]){
                    //swap
                    int temp=nums1[j-1];
                    nums1[j-1]=nums1[j];
                    nums1[j]=temp;

                }
            }
        }


    }
}