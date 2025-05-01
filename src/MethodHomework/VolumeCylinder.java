package MethodHomework;

import java.util.Scanner;

//Volume Of Cylinder
public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the height");
        double h= sc.nextDouble();
        System.out.println("Enter the radius");
        double r= sc.nextDouble();
        System.out.println(Volume(h,r));
    }

    static double Volume(double h, double r){
        double volume=0;
        volume= Math.PI * r * r * h;
        return volume;
    }

}
