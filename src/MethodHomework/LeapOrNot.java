package MethodHomework;

import java.util.Scanner;

//Input a year and find whether it is a leap year or not.
public class LeapOrNot {
    public static void main(String[] args) {
        boolean leap=false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");
        int year= sc.nextInt();

        System.out.println(isLeap(year));
    }
    static public boolean isLeap(int year){
        boolean leap=false;
        if (year%4==0){
            if (year%100==0){
                if(year%400==0){
                    leap=true;
                }
            }else {
                leap=true;
            }
        }else{
            leap=false;
        }
        return leap;
    }



}
