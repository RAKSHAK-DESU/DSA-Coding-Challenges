package MethodHomework;
//Area Of Parallelogram
import java.util.Scanner;

public class AreaParallelogram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base");
        double base= sc.nextDouble();
        System.out.println("Enter height");
        double height= sc.nextDouble();

        System.out.println(Area(base,height));
    }
    static double Area(double base, double height){
        double area=0;
        area=base*height;
        return area;
    }


}
