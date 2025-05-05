package BinarySearch;



public class CeilingNumber {
    public static void main(String[] args) {

        int[] arr={1,2,4,7,8,9,10};
        int target= 6;

        int result=Ceiling(arr,target);
        System.out.println(result);
    }
    static int Ceiling(int arr[] , int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int middle=start+(end-start)/2;

            if (target<arr[middle]){
                end=middle-1;
            } else if (target> arr[middle]) {
                start=middle+1;
            }else {
               return middle;
            }
        }
        return start;
    }
//Answer does not lie between start and end , hence it dosent lie
// in that range thats why go to next gretaer element , which is start
}
