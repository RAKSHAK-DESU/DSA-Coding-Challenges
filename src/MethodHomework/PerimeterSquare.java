package MethodHomework;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Scanner;

//Perimeter Of Square
public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of side of square");
        double a= sc.nextDouble();

        System.out.println(Perimeter(a));
    }
    static double Perimeter(double a){
       double perimeter=0;
       perimeter=4*a;
       return perimeter;
    }
}
