package MethodHomework;

import java.util.Scanner;

//Area Of Rhombus
public class AreaRhombus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Diagonal 1");
        double p= sc.nextDouble();
        System.out.println("Enter Diagonal 2");
        double q= sc.nextDouble();

        System.out.println(Area(p,q));
    }
    static double Area(double p,double q){
        double area=0;
        area= q*p*0.5;
        return area;
    }
}
