package DSA_COURSE;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        String Speciality= sc.next();

        switch (num) {
            case 1 -> System.out.println("Coder Chad");
            case 2 -> {
                System.out.println("Rakuzan");
                switch (Speciality) {
                    case "first" -> System.out.println("2nd life");
                    case "Second" -> System.out.println("2nd life");
                }
            }
            case 3 -> System.out.println("Sukuna");
            case 4 -> System.out.println("Kenji");
            default -> throw new IllegalStateException("Unexpected value: " + num);
        }
    }
}
