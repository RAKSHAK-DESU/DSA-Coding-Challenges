package MethodHomework;
//Perimeter Of Circle
import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius of the circle");
        double r=sc.nextDouble();
        System.out.println(Perimeter(r));
    }
    static double Perimeter(double r){
        double perimeter=0;
        perimeter= 2*3.1416*r;
        return perimeter;
    }

}
