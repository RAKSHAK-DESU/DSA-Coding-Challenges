package MethodHomework;

import java.util.Scanner;

public class CurvedSurfaceAreaCylinder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius");
        double r= sc.nextDouble();
        System.out.println("Enter the height");
        double h=sc.nextDouble();
        System.out.println(CSA(r,h));
    }

    static double CSA(double r,double h){
        double csa=0;
        csa= 2*Math.PI*r*h;
        return csa;
    }
}
