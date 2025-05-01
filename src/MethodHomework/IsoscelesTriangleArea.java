package MethodHomework;

import java.util.Scanner;

//Area Of Isosceles Triangle
public class IsoscelesTriangleArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base");
        double base= sc.nextDouble();
        System.out.println("Enter the height");
        double height= sc.nextDouble();

        double Ans= Area(base,height);
        System.out.println(Ans);
    }
    static double Area(double base, double height){
        double area=0;
        area = 0.5*base*height;
        return area;
    }

}
