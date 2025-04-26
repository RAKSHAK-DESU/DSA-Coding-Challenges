package MethodHomework;

import java.util.Scanner;

//Take 2 numbers as inputs and find their HCF and LCM.
public class LowestAndHigest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = HCF(num1, num2);
        int b = LCM(num1, num2);
        System.out.println("HCF is " + a + " LCM is "   + b);
    }

    static int HCF(int num1, int num2) {
        int hcf = 1;
        int smaller;
        if (num1 > num2) {
            smaller = num2;
        } else {
            smaller = num1;
        }

        for (int i = 1; i <= smaller; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    static int LCM(int num1, int num2) {
        int largest;

        if (num1 > num2) {
            largest = num1;
        } else {
            largest = num2;
        }
        while (true) {
            if (largest % num1 == 0 && largest % num2 == 0) {
                return largest;
            }
            largest++;
        }

    }


}
