package MethodHomework;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        fibonacci(n);
    }

    static void fibonacci(int n){
        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        for (int i = 0; i < n; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }

    }
}
