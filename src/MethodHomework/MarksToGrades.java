package MethodHomework;

import java.awt.*;
import java.util.Scanner;

public class MarksToGrades {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter Your Marks Out of 100");
        int marks= sc.nextInt();

        String Ans=DisplayGrade(marks);
        System.out.println(Ans);
    }
    static String DisplayGrade(int marks){
        String grade="";
        if (marks >=91){
            grade="AA";
        } else if (marks>=81 && marks<=90) {
            grade="AB";
        }else if (marks>=71 && marks<=80) {
            grade="BB";
        }else if (marks>=61 && marks<=70) {
            grade="BC";
        }else if (marks>=51 && marks<=60) {
            grade="CD";
        }else if (marks>=41 && marks<=50) {
            grade="DD";
        }else if (marks<=40) {
            grade="Fail";
        }
        return grade;
    }

}
