package DSA_COURSE;

import javax.xml.transform.Source;
import java.lang.reflect.Array;
import java.util.Scanner;

public class LARGEST {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

       if (a>b && a>c){
           System.out.println(a +" is Largest");
       } else if (b>a && b>c) {
           System.out.println(b+" is Largest");
       }else {
           System.out.println(c+" is Largest");
       }


    }
}
