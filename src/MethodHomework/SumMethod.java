package MethodHomework;

import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Two Numbers to get Sum");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int result=Sum(num1,num2);
        System.out.println(result);
    }
    static int Sum(int num1, int num2){
        int result=0;
        result= num1+num2;
        return result;
    }
}
