package MethodHomework;
//Perimeter Of Parallelogram
import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base of the parallelogram");
        double base= sc.nextDouble();
        System.out.println("Enter side of the parallelogram");
        double side= sc.nextDouble();

        System.out.println(Perimeter(base,side));
    }
    static double Perimeter(double base,double side){
        double perimeter=0;
        perimeter= 2*(base+side);
        return perimeter;
    }
}
