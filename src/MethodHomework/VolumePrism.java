package MethodHomework;

import java.util.Scanner;

//volume of prism
public class VolumePrism {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  base");
        double b= sc.nextDouble();
        System.out.println("Enter the height");
        double h=sc.nextDouble();

        System.out.println(Volume(b,h));
    }
    static double Volume(double b, double h){
        double volume=0;
        volume= b*h;
        return volume;
    }

}
