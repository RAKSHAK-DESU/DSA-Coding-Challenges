package MethodHomework;
//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1= sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2= sc.nextInt();

        int Large= Largest(num1,num2);
        System.out.println(Large);
    }

    static int Largest(int num1, int num2){
        int largest=0;
        if (num1>num2){
            largest=num1;
        }else {
            largest=num2;
        }
        return largest;
    }
}
