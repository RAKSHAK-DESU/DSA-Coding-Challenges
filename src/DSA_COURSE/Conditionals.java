package DSA_COURSE;

public class Conditionals {
    public static void main(String[] args) {
        int salary= 100000;

        if(salary>10000 && salary<20000){
            salary+=2000;
        } else if (salary>20000) {
            salary+=3000;
        } else{
            salary+=1000;
        }
        System.out.println(salary);
    }
}
