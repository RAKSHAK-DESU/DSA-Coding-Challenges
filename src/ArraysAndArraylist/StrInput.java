package ArraysAndArraylist;

import java.util.Arrays;
import java.util.Scanner;

public class StrInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.next();
        }

        System.out.println(Arrays.toString(arr));

        //modify an array

        arr[0]="Reon";
        arr[1]="Akane";
        System.out.println(Arrays.toString(arr));
    }
}
