package MethodHomework;

import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius");
        double r= sc.nextDouble();
        System.out.println(Volume(r));
    }
    static double Volume(double r){
        double volume=0;
        volume=Math.PI*r*r*r*4.0/3.0;
        return volume;
    }
}
