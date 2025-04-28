public class Max {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,23,4,5,21,1};

        System.out.println(max(arr));
    }
    static int max(int[] arr){
    int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
    return max;
    }

}
