/*
Write a Java program to calculate the electricity bill of a household based on the number of units consumed. The billing is calculated as follows:
For the first 100 units – ₹1.5 per unit
For the next 100 units (101–200) – ₹2.5 per unit
For the next 100 units (201–300) – ₹4.0 per unit
Above 300 units – ₹6.0 per unit
Fixed meter charge – ₹50 (added to every bill)

Input:
 Customer name
 Meter number
 Units consumed

Output:
 Customer With Total bill (including fixed charges) */
package MethodHomework;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name= sc.next();
        System.out.println("Enter Meter Number");
        String MeterNumber= sc.next();
        System.out.println("Enter Units Consumed");
        Double units= sc.nextDouble();

        Double result=Bill(units);
        System.out.println(result);
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Customer Name : " + name);
        System.out.println("Meter Number  : " + MeterNumber);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill    : ₹" + result);
    }

    static Double Bill(Double UnitConsumed){
         double charge =0;
        if (UnitConsumed<=100){
            charge+=UnitConsumed*1.5;
        } else if (UnitConsumed<=200) {
            charge += (100*1.5)+((UnitConsumed-100)*2.5);
        } else if (UnitConsumed<=300) {
            charge+=(100*1.5)+(100*2.5)+((UnitConsumed-200)*4);
        } else if (UnitConsumed>300) {
            charge+=(100*1.5)+(100*2.5)+(100*4)+((UnitConsumed-300)*6);
        }

        charge=charge+50;// fixed meter charfe

        return charge;
    }
 }
