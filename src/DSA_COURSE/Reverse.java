package DSA_COURSE;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int num=sc.nextInt();
       int ans=0;
        while (num>0){
            int rem= num%10;
            num/=10;


            ans=ans*10;
            ans+=rem;

        }

        System.out.println(ans);



    }
}
