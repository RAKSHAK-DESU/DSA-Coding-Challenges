package ArraysAndArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();

        //Initialise
        for (int i = 0; i < 4; i++) {
            list.add(new ArrayList<>());
        }
        
        //add elements
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}
