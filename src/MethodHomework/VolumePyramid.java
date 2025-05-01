package MethodHomework;

import java.util.Scanner;

//Volume Of Pyramid
public class VolumePyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Base length");
        double l=sc.nextDouble();
        System.out.println("Enter the Base width");
        double w=sc.nextDouble();
        System.out.println("Enter the Pyramid height");
        double h= sc.nextDouble();

        System.out.println(Volume(l,w,h));
    }
    static double Volume(double l,double w,double h){
        double volume=0;
        volume=l*w*h/3.0;
        return volume;
    }
}
