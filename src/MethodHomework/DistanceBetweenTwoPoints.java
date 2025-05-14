package MethodHomework;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter x1: ");
        double x1= sc.nextDouble();
        System.out.println("Enter y1: ");
        double y1= sc.nextDouble();
        System.out.println("Enter x2: ");
        double x2= sc.nextDouble();
        System.out.println("Enter y2: ");
        double y2= sc.nextDouble();

        double Ans= Distance(x1,y1,x2,y2);
        System.out.println(Ans);
    }

    static double Distance(double x1, double y1, double x2, double y2){
        double dist= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return dist;

    }
}
