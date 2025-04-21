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

        int max=a;
       if(b>max){
           max=b;
       }
       if(c>max){
           max=c;
       }
        System.out.println(max);


    }
}
