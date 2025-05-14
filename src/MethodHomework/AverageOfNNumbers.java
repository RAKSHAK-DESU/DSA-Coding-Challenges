package MethodHomework;

import java.util.Scanner;

//Calculate Average Of N Numbers
public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many number you wanna enter?");
        int n= sc.nextInt();
        System.out.println("Enter the numbers");
        int total=0;
        for (int i=0; i<n;i++){
            total+=sc.nextInt();
        }

        int ans=Average(n,total);
        System.out.println(ans);
    }
    static int Average(int n, int total){
        int avg= total/n;
        return avg;
    }


}
