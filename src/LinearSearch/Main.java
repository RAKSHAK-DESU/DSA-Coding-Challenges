package LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] nums={12,43,12,467,76,45,23,76,34,2398,239,2398,89,745};
        int target=239;

        System.out.println(LinearSearch(nums,target));
        System.out.println(ElementReturn(nums,target));
        System.out.println(ExistOrNot(nums,target));
    }

    static boolean ExistOrNot(int[] arr, int target){
        if (arr.length==0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return true;
            }
        }
        return false;
    }

    static int ElementReturn(int[] arr,int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return arr[i];
            }
        }
        return -1;
    }

    static int LinearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element=arr[i];
            if (element==target){
                return i;
            }
        }
        //this line will execute if none of the above code is exevuted so
        return -1;
    }

}
