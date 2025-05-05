package BinarySearch;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letter= {'a', 'b','c','d','e','i'};
        char target='h';

        System.out.println(NextGreatestLetter(letter,target));;
    }
    static char NextGreatestLetter(char[] letter, char target){
        int start=0;
        int end=letter.length-1;

        while (start<=end){
            int mid= start+(end-start)/2;

            if (target<letter[mid] ){
                end=mid-1;
            } else  {
                start=mid+1;
            }
        }
        return letter[start%letter.length];
    }

}
