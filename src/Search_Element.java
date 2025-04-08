/*
 * Problem: Search an element in an array
 * Platform: CodeChef - Practice
 * Link: https://www.codechef.com/practice/course/arrays/ARRAYS/problems/SEARCHINARR
 * Language: Java
 * Submission Date: 2025-04-08
 */

import java.util.*;
import java.lang.*;

class Search_Element
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scanner= new Scanner(System.in);
        int N= scanner.nextInt();
        int X= scanner.nextInt();

        int[] A=new int[N];


        for (int i=0; i<A.length ; i++){
            A[i]= scanner.nextInt();
        }

        boolean Match=false;


        for (int i=0;i<N ;i++ ){
            if(A[i]==X){
                Match=true;
                break;
            }
        }

        if (Match){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
