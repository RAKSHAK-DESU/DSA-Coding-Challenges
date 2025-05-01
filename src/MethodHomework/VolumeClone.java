package MethodHomework;

import java.util.Scanner;

//Volume Of Cone
public class VolumeClone {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius");
        double r= sc.nextDouble();
        System.out.println("Enter the height");
        double h=sc.nextDouble();

        System.out.println(Volume(r,h));
    }
    static double Volume(double r, double h){
        double volume=0;
        volume= 3.1416*r*r*h/3;
        return volume;
    }

}
