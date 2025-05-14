package MethodHomework;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number to get sum of its digits");
        int num= sc.nextInt();

        int result=sum(num);
        System.out.println(result);
    }
    static int sum(int num){
        int sum=0;
        while (num>0){
           int remainder= num%10;
           sum+=remainder;
           num=num/10;
        }
        return sum;
    }
}
