package DSA_COURSE;

import java.util.Scanner;
//PRIME OR NOT
public class Question1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans= isPrime(n);
        System.out.println(ans);
        }

        static boolean isPrime(int n) {
            if (n <= 1) {
                System.out.println(false);
            }
            int c = 2;
            while (c * c <= n) {
                if (n % c == 0) {
                    return true;
                }
                c++;

            }
            if(c*c>n){
                return true;
            }else {
                return false;
            }

        }

    }

