package MethodHomework;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int digit= digits(num);
        int value= calculate(digit,num);
        boolean Armstrong= isArmstrong(num,value);
        System.out.println(Armstrong);
    }
    static int digits(int num){
        int counter=0;
        while (num>0){
            int remainder= num%10;
            counter++;
            num=num/10;
        }

        return counter;
    }

    static int calculate(int digit, int num){
        int sum=0;
        while (num>0){
            int remainder= num%10;
            sum+= (int)Math.pow(remainder,digit);
            num=num/10;

        }
        return sum;
    }

    static boolean isArmstrong(int num, int sum){
        boolean isArmstrong=false;
        if (num==sum){
            isArmstrong=true;
        }
        return isArmstrong;
    }
}