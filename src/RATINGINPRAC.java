/*
 * Problem: Difficulty Rating Order
 * Platform: CodeChef - Practice
 * Link: https://www.codechef.com/practice/course/arrays/ARRAYS/problems/RATINGINPRAC
 * Language: Java
 * Submission Date: 2025-04-13
 */

import java.util.Scanner;

public class RATINGINPRAC  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];

            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }

            // Your code goes here
            boolean isNonDecreasing = true;

            for (int i = 1; i < n; i++) {
                if (d[i] < d[i - 1]) {
                    isNonDecreasing = false;
                    break;
                }

            }
            if (isNonDecreasing) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        /* for (int i=0;i<n ;i++ ){
             if(d[i]<=d[i+1]){
                 System.out.println("Yes");
             }else if(d[i]>=d[i-1]){
                 System.out.println("No");

          */
    }
}

