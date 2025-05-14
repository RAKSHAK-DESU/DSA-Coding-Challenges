package MethodHomework;

import java.util.Scanner;

//Calculate Discount Of Product
public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the original Cost of the product");
        double cost= sc.nextDouble();
        System.out.println("Enter The Discount in %");
        double discount=sc.nextDouble();
        System.out.println(DiscountedPrice(cost,discount));
    }
    static double DiscountedPrice(double cost,double discount){
        double price=0;
        double Discount= cost/discount;
        price= cost-discount;
        return price;
    }
}
