package ArraysAndArraylist;

public class main {
    public static void main(String[] args) {
        String[] name= new String[5];
        System.out.println(name[2]);

        int[] arr= new int[5];
        System.out.println(arr[2]);

        boolean[] ar1= new boolean[4];
        System.out.println(ar1[2]);

        arr[0]=13432;
        arr[1]=2352;
        arr[2]=276;
        arr[3]=245;
        arr[4]=3432;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
