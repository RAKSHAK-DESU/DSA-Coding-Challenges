package MethodHomework;

import java.util.Scanner;

//Take a number as input and print the multiplication table for it.
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= sc.nextInt();

        Table(num);
    }
    static void Table(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+num*i);
        }
    }

}
