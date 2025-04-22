package DSA_COURSE;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // take input from user as long as user does not press x or C
        int result=0;
        while (true){
            //take the operator as input
            char op= sc.next().trim().charAt(0);
            if (op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                int num1=sc.nextInt();
                int num2=sc.nextInt();

                if (op=='+'){
                    result=num1+num2;
                }
                if (op=='-'){
                    result=num1-num2;
                }
                if (op=='/'){
                    if(num2!=0){
                        result=num1/num2;
                    }
                }
                if (op=='*'){
                    result=num1*num2;
                }
                if (op=='%'){
                    result=num1%num2;
                }
            } else if (op=='x'||op=='X') {
                break;
            }else {
                System.out.println("Invalit Operation");
            }
            System.out.println(result);
        }

    }
}
