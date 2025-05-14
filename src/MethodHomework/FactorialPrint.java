package MethodHomework;

import java.util.Scanner;

public class FactorialPrint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to get it Factorial");
        int num= sc.nextInt();

       Factorial(num);
        int ex=1;
       while (ex<=num){
           System.out.print(ex+"*");
           ex+=1;
       }
        System.out.print("=");
        System.out.println(Factorial(num));
    }

    static int Factorial(int num){
        int product=1;
        while (num>0){
            int remainder=num%10;
            product*=remainder;
            num=num-1;
        }
        return product;
    }
}
