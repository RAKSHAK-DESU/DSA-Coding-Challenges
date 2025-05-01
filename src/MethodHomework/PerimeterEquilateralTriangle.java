package MethodHomework;

import java.util.Scanner;

public class PerimeterEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of a side of triangle");
        double a=sc.nextDouble();
        System.out.println(Perimeter(a));
    }
    static double Perimeter(double a){
        double perimeter=0;
        perimeter=3*a;
        return perimeter;
    }


}
