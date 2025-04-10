/*
 * Problem: Take discount or Not
 * Platform: CodeChef - Practice
 * Link: https://www.codechef.com/practice/course/arrays/ARRAYS/problems/DISCOUNTT
 * Language: Java
 * Submission Date: 2025-04-10
 */
    import java.util.Scanner;

    public class DISCOUNT {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            while (t-- > 0) {
                int n = scanner.nextInt();
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextInt();
                }
                // Your code goes here
                int OriginalTotal=0;
                int DiscountedTotal=0;
                for (int i=0;i<= a.length-1 ;i++ ){
                    OriginalTotal+=a[i];
                    int DiscountedPrice=a[i]-y;
                    if(DiscountedPrice<=0){
                        DiscountedPrice=0;
                    }
                    DiscountedTotal+=DiscountedPrice;
                }
                //now OriginalTotal holds sum of original prices;
                //  DiscountedTotal hols sum of discounted prices per item

                if(DiscountedTotal+x<OriginalTotal){
                    System.out.println("COUPON");
                }else{
                    System.out.println("NO COUPON");
                }
            }
        }
    }


