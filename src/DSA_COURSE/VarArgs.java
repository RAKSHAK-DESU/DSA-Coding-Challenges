package DSA_COURSE;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(8,3,5,3,4,3);
    }
    static void fun(int ...v){//taking an array of integers
        System.out.println(Arrays.toString(v));
    }







    static void func(String ...v){//taking an array of integers

    }
    static void funct(Character ...v){//taking an array of integers

    }
}
