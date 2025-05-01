package MethodHomework;

import java.util.Scanner;

public class TotalSurfaceAreaCube {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side Length");
        double a=sc.nextDouble();

        System.out.println(TSA(a));
    }
    static double TSA(double a){
        double tsa=0;
        tsa= 6*a*a;
        return tsa;
    }
}
