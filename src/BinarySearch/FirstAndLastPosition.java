package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,6,6,6,6,7,7,7,8,9};
        int target=6;
        System.out.println(Arrays.toString(SearchRange(nums,target)));;
    }
    static int[] SearchRange(int[] nums, int target){
        int[] ans={-1,-1};
        int start= Search(nums,target,true);
        int end= Search(nums,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
        //check for 1st occurence of target first

    }
    //this function just returens the index value of array
    static int Search(int[] nums, int target, boolean FindStartIndex){
        int ans=-1;
        int start=0;
        int end= nums.length-1;

        while (start<=end){
            int mid= start+(end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }else {
               ans=mid;
               if (FindStartIndex){
                   end=mid-1;
               }else {
                   start=mid+1;
               }
            }
        }
      return ans;
    }

}
