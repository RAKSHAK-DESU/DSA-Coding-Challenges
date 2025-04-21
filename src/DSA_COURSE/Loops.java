package DSA_COURSE;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();

        for (int i = 1; i < num+1; i++) {
            System.out.println(i);
        }


    }
}
