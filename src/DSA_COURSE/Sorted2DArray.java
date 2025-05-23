package DSA_COURSE;

import java.util.Arrays;

public class Sorted2DArray {
    public static void main(String[] args){
        int[][] arr={
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target=37;

        System.out.println(Arrays.toString(Search(arr,target)));
        ;
    }
    static int[] Search(int[][] arr, int target){
        int r=0;
        int c=arr.length-1;

        while (r<arr.length && c>=0){
            if (arr[r][c]==target){
                return new int[]{r,c};
            } else if (arr[r][c]<target) {
                r++;
            } else if (arr[r][c]>target) {
                c--;
            }
        }
        return new int[]{-1,-1};
    }

}
/*
     for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[row][col]==target){
                    System.out.println(row+""+col);
                }
            }
        }*/