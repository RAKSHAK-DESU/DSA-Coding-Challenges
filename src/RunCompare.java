import java.util.Scanner;

public class RunCompare{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t--> 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            // Your code goes here
            int bothHappy = 0;
            for (int i = 0; i < n; i++) {
                boolean AUnHappy = b[i] > 2 * a[i];
                boolean BUnHappy = a[i] > 2 * b[i];

                if (!AUnHappy && !BUnHappy) {
                    bothHappy += 1;
                }
            }
            System.out.println(bothHappy);
            /*         boolean UnhappyADays = false;
                    boolean UnhappyBDays= false;
                    int bothHappy=0;
                    for (int i = 0; i < n; i++) {
                        if (a[i] >= 2 * b[i]) {
                            UnhappyBDays=true;
                        } else if (b[i] >= 2 * a[i]) {
                            UnhappyADays= true;
                           
                        }else{
                            bothHappy+=1;
                        }
                    }
                    */




        }
    }
}