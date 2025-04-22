package DSA_COURSE;

import java.lang.reflect.Array;
import java.util.Scanner;

public class NumCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("main number");
        int a= sc.nextInt();
        System.out.println("Enter numbers");
        int n = sc.nextInt();

        int count=0;
        while (n>0){
            int rem=n%10;  //get last number
            if(rem==a){
                count++;
            }
            n=n/10;

        }
        System.out.println(count);

    }
}
