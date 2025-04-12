
    import java.util.Scanner;

    public class LARGESECOND {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            while (t-- > 0) {
                int n = scanner.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();
                }
                // Your code goes here
                int max=0;
                int secMax=0;
                for (int i=0;i<n ;i++ ){
                    if(a[i]>max){
                        secMax=max;
                        max=a[i];
                    }else if (a[i]>secMax && a[i]!=max){
                        secMax=a[i];
                    }
                }

                int result= max + secMax;
                System.out.println(result);



   /*        int max=a[0];
            for (int i =0;i<n ;i++ ){
                if(a[i]>max){
                    max=a[i];
                }

             }

            for (int i =0;i<n ;i++ ){

                if (a[i]<max ){
                    int [] b=new int[n];
                }
            }
            for (int i =0;i<n ;i++ ){
                 int secMax=a[0];
                if(b[i]>max){
                    secMax=a[i];
                }

            }
            int result= max+secMax;
            System.out.println(result);
            */

            }
        }
    }


