package MethodHomework;

import java.util.Scanner;

//Perimeter Of Rectangle
public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length of Rectangle");
        double l= sc.nextDouble();
        System.out.println("Enter width of Rectangle");
        double w= sc.nextDouble();

        System.out.println(Perimeter(l,w));
    }
    static double Perimeter(double l,double w){
        double perimeter=0;
        perimeter= 2*(l+w);
        return perimeter;
    }
}
