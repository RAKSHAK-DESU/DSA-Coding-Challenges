/*
 * Problem: Find Maximum in an array
 * Platform: CodeChef - Practice
 * Link: https://www.codechef.com/practice/course/arrays/ARRAYS/problems/UWCOI20A?tab=statement
 * Language: Java
 * Submission Date: 2025-04-08
 */

import java.util.*;
import java.lang.*;

class MaxArray
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner scanner= new Scanner(System.in);

            int T=scanner.nextInt();

            for (int t = 0; t < T; t++) {
                int N = scanner.nextInt(); // Number of mountains
                int max = Integer.MIN_VALUE;

                for (int i = 0; i < N; i++) {
                    int height = scanner.nextInt();
                    if (height > max) {
                        max = height;
                    }
                }

                System.out.println(max);
            }
        }



    }


