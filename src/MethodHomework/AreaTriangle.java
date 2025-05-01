package MethodHomework;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base of triangle");
        double base= sc.nextDouble();
        System.out.println("Enter the height");
        double height= sc.nextDouble();

        double result= Area(base,height);
        System.out.println(result);
    }

    static double Area(double base,double height){
        double area=0;
        area= 0.5*base*height;
        return area;
    }

}
