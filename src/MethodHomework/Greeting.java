package MethodHomework;
//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name= sc.next();

        String greet= greeting(name);
        System.out.println(greet);
    }
    static String greeting(String name){
        String str= "Hello Mr/Ms "+name+" Good Morning";
        return str;
    }


}
