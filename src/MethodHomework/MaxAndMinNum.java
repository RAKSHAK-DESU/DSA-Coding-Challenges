package MethodHomework;

import java.util.Scanner;

//https://www.java67.com/2019/05/how-to-find-largest-and-smallest-of-three-numbers-in-java.html
public class MaxAndMinNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int arr[]= new int[3];


        for (int i = 0; i <3; i++) {
            arr[i] = sc.nextInt();
        }

        int a=Largest(arr);
        int b= Smallest(arr);
        System.out.println("Largest : "+a);
        System.out.println("Smallest : "+b);

    }
    static int Largest(int[] arr){
        int max=arr[0];
        for (int i = 0; i < 3; i++) {

            if (arr[i]>max){
                max=arr[i];
            }
        }
        return  max;
    }

    static int Smallest(int[] arr){
        int min=arr[0];
        for (int i = 0; i < 3; i++) {

            if (arr[i]<min){
                min=arr[i];
            }
        }
        return  min;
    }
}
