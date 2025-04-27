package MethodHomework;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class USDConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in INR");
        double amount= sc.nextInt();

        double result =USDConverter(amount);
        System.out.println("$"+result);
    }
    static double USDConverter(double amount){
        amount=amount*0.012;
        return amount;
    }

}
