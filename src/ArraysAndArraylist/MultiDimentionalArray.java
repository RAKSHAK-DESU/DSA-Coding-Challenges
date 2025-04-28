package ArraysAndArraylist;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[][] arr = new int[3][3];

        int[][] arr2D= {
                {1,2,3},
                {4, 5},
                {6,7,8,9}
        };
        System.out.println(arr2D[1][1]);

        int[][] arr2= new int[3][3];
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col]=sc.nextInt();
            }
        }

        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                System.out.println(arr2[row][col]);
            }
        }


    }
}
