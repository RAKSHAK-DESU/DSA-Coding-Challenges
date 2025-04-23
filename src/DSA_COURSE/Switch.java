package DSA_COURSE;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String fruit= sc.next();

        switch (fruit) {  //alt+Enter to enchanced switch code
            case "Mango" -> System.out.println("King");
            case "Apple" -> System.out.println("Keeps Doctor Away");
            case "Orange" -> System.out.println("Nagpur");
            case "Berry" -> System.out.println("Juice");
            default -> System.out.println("Please Enter a valid fruit");
        }
    }
}
