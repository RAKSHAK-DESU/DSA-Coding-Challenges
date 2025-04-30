package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String str="RAKSHAK IS KING , HE IS SON OF TOPG";
        char target='K';
        boolean result =Search(str,target);
        System.out.println(result);
    }
   // static boolean Search1(){

 //   }













    static boolean Search(String str, char target){
        if (str.length()==0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
