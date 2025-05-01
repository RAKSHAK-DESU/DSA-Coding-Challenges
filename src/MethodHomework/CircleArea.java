package MethodHomework;

import java.util.Scanner;

//Area Of Circle Java Program
public class CircleArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        double radius= sc.nextDouble();
        double Ans=Area(radius);
        System.out.println(Ans);
    }
    static double Area(double radius){
        double area=0;
        area= Math.pow(radius,2) *3.1416;
        return area;
    }
}
