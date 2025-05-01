package MethodHomework;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length");
        double l= sc.nextDouble();
        System.out.println("enter height");
        double h=sc.nextDouble();

        double Ans= Area(l,h);
        System.out.println(Ans);
    }
    static double Area(double l,double h){
        double area=0;
        area=l*h;
        return area;
    }

}
