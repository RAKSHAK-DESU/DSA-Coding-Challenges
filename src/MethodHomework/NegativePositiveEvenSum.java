package MethodHomework;

import java.util.Scanner;

//Write a program to print the sum of negative numbers, sum of positive even numbers and
// the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.

// using a custom class
class SumResult{
    int sumNeg=0;
    int sumPosEven=0;
    int sumPosOdd=0;
}
public class NegativePositiveEvenSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers");
        SumResult result= CalculateSums(sc);
        System.out.println("Sum of neg nums is :"+ result.sumNeg);
        System.out.println("Sum of Odd nums is :"+ result.sumPosOdd);
        System.out.println("Sum of Even nums is :"+ result.sumPosEven);
    }

    static SumResult CalculateSums(Scanner sc){
        SumResult result= new SumResult();

        while (true){
            int num= sc.nextInt();

            if (num==0){
                break;
            }

            if (num<0){
                result.sumNeg+=num;
            } else if (num%2==0) {
                result.sumPosEven+=num;
            } else{
                result.sumPosOdd+=num;
            }
        }
        return result;
    }
}
