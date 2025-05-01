package MethodHomework;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b= sc.nextInt();

        System.out.println("Enter an Operator");
        String operator= sc.next();

        int result=Calculate(a,b,operator);
        System.out.println(result);
    }
    static int Calculate(int a,int b, String operator){
        int result=0;
        if (operator.equals("+")){
            result=a+b;
        } else if (operator.equals("-")) {
            result=a-b;
        } else if (operator.equals("*")) {
            result=a*b;
        } else if (operator.equals("/")) {
            if (b==0){
                return -1;
            }else {
                result=a/b;
            }

        }
        return result;
    }
}
