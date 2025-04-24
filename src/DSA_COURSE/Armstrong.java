package DSA_COURSE;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
      //  int num= sc.nextInt();
      //  boolean a= isArmstrong(num);
       // System.out.println(a);

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }

    }
    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;

        while (n>0){
            int rem=n%10;
            n=n/10;

            sum=sum + rem*rem*rem;

        }
        if (sum==original){
            return true;
        }else {
            return false;
        }
    }
}
