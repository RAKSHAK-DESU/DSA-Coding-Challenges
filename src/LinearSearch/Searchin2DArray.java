package LinearSearch;

import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] arr={
            {2,53,23,65,12},
            {65,34,5,34,65,23},
            {9384,238,-123,-3,13},
            {-120,23,54,23,654,23}
        };

        int target=-3;
        int[] ans=Search(arr,target);//format of return value {row, column}
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row ,col};
                }
            }

        }
        return new int[]{-1,-1};
    }
}
