package MethodHomework;

import java.util.Scanner;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class SumOfAll {
    public static void main(String[] args){
        int sum=0;
        Scanner sc= new Scanner(System.in);

        sum= Sum(sc,sum);
        System.out.println("Total sum"+sum);
    }
    static int Sum(Scanner sc,int sum){
        String input;
        do {
            System.out.println("Enter a number or 'X' to stop");
            input=sc.nextLine();

            if(!input.equalsIgnoreCase("X")){
                try{
                    int num= Integer.parseInt(input);
                    sum+=num;
                }catch (NumberFormatException e){
                    System.out.println("Enter a valiid number");
                }
            }
        }while (!input.equalsIgnoreCase("X"));
        return sum;
    }

}
