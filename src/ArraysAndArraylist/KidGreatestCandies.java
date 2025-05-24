package ArraysAndArraylist;


import java.util.ArrayList;
import java.util.List;

public class KidGreatestCandies  {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int largest=0;
            for(int i=0;i<candies.length;i++){
                if(candies[i]>largest){
                    largest=candies[i];
                }
            }


            List<Boolean> result= new ArrayList<>();


            for(int i=0;i<candies.length;i++){
                if(candies[i]+extraCandies>=largest){
                    result.add(true);
                }else{
                    result.add(false);
                }


            }
            return result;
        }
    }

