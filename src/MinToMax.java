import java.util.Scanner;
public class MinToMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int noOfOperations = 0;

            int m = a[0];
            for (int i = 0; i < a.length; i++) {


                if (a[i] < m) {
                    m = a[i];
                }
                //else {
                //    m = a[0];
                // }

            }
            // now m in min value

            for (int i = 0; i < a.length; i++) {

                if (a[i] > m) {
                    a[i] = m;
                    noOfOperations += 1;
                }

            }

            System.out.println(noOfOperations);


        }
    }
}