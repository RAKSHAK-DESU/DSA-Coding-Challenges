import java.util.Scanner;

public class DNASTORAGE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            StringBuilder encoded = new StringBuilder();

            // Your code goes here
            for (int i=0;i<n ;i+=2 ){
                String pair = s.substring(i,i+2);

                switch(pair){
                    case "00":
                        encoded.append("A");
                        break;
                    case "01":
                        encoded.append("T");
                        break;
                    case "10":
                        encoded.append("C");
                        break;
                    case "11":
                        encoded.append("G");
                        break;
                }
            }
            System.out.println(encoded);
        }
    }
}
