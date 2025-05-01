package MethodHomework;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        double principal= sc.nextDouble();
        System.out.println("Enter Time in Years");
        double time= sc.nextDouble();
        System.out.println("Enter Rate of Interest");
        double rate=sc.nextDouble();

        double Ans=SimpleInterest(principal,time,rate);
        System.out.println(Ans);

    }
    static double SimpleInterest(double P,double T,double R){
        double Result= P*T*R;
        Result= Result/100;
        return Result;
    }
}
