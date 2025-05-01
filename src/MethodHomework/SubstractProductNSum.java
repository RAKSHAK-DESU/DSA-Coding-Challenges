package MethodHomework;

import java.util.Scanner;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
public class SubstractProductNSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter numbers");
        int num=sc.nextInt();

        int pro= Product(num);
        int sum=Sum(num);

        int result=subtractProductAndSum(sum,pro);
        System.out.println(result);
    }
    static int Product(int num){
        int product=1;
        while (num>0){
           int remainder=num%10;
           product=product*remainder;
           num=num/10;
        }
        return product;
    }
    static int Sum(int num){
        int sum=0;
        while (num>0){
            int remainder=num%10;
            sum=sum+remainder;
            num=num/10;
        }
        return sum;
    }
    static int subtractProductAndSum(int sum, int product){
        int result=0;
        result =product-sum;
        return result;
    }
}
