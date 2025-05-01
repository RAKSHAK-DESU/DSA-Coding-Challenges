package MethodHomework;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int original= sc.nextInt();


        System.out.println(isPalindrome( original,palindrom(original)));

    }
    static int palindrom(int original){
        int reversed=0;
        while (original>0){
            int lastDigit= original%10;
            reversed=reversed*10+lastDigit;
            original=original/10;

        }
        return reversed;
    }

    static boolean isPalindrome(int original, int reversed)
    {
        boolean palNum=false;
        if (original==reversed){
            palNum=true;
        }
        return palNum;
    }


}
