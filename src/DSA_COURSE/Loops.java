package DSA_COURSE;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        // For loop
        for (int i = 1; i < num+1; i++) {
            System.out.print(i+" ");
        }

        //While Loop
        int num1=1;
        while (num1<=5){
            System.out.println(num1);
            num1++;
        }

    }
}
