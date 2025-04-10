import java.util.Scanner;
public class KITCHENCOST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }

            // Your code goes here
            // freshness value must be greater than x, a is cost and is so if x is greater than a , add its b index to total cost
            int totalCost=0;
            for (int i=0;i<a.length;i++ ){

                if(a[i]>=x){
                    totalCost+=b[i];
                }
            }

            System.out.println(totalCost);
        }
    }
}


