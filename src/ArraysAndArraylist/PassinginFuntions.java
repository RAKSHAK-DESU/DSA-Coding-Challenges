package ArraysAndArraylist;

import java.util.Arrays;

public class PassinginFuntions {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        Change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Change(int[] arr){
        arr[0]=99;
    }
}
