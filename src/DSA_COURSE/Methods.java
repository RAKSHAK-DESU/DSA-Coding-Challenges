package DSA_COURSE;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st number");
        int num1= sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2=sc.nextInt();
        int result =sum(num1,num2);
        System.out.println(result);
    }
    static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    static void add(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Add 1st num:");
        int num1= sc.nextInt();
        System.out.print("Add 2nd num:");
        int num2= sc.nextInt();
        int sum= num1+num2;
        System.out.println(sum);
    }


}
