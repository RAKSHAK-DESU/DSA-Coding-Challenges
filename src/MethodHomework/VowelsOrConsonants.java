package MethodHomework;

import java.util.Scanner;
class Alphabet{
    String Volwel;
    String Consonant;
}
public class VowelsOrConsonants {
    public static void main(String[] args) {
        Alphabet input= new Alphabet();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.next();

        VowelorConsonant(str);

    }
    static void VowelorConsonant(String str){


        boolean isVowel=false;
        for (int i = 0; i < str.length(); i++) {
            char ch= Character.toLowerCase(str.charAt(i));
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u'){
                System.out.println(ch+" is a vowel");
            }else {
                System.out.println(ch+" is not a vowel");
            }
        }


    }
}
