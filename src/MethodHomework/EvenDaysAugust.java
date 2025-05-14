package MethodHomework;
//Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
public class EvenDaysAugust {
    public static void main(String[] args) {
        int AugustDays=31;

        System.out.println(totalDays(AugustDays));
    }
    static int totalDays(int AugustDays){
        int days=0;
        for (int i = 1; i <= AugustDays; i++) {
            if (i%2==0){
                days++;
            }
        }
        return days;
    }

}
