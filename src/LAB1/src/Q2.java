//Aim of the program: Write a program to print the corresponding grade for the given
//mark using if..else statement in Java

import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks(0-100) : ");
        int marks = sc.nextInt();

        String grade;
        if (marks >= 90 && marks <= 100){
            grade ="O";
        }else if (marks >= 80 && marks <= 90) {
            grade = "E";
        }else if (marks >= 70 && marks <= 80) {
            grade = "A";
        }else if (marks >= 60 && marks <= 70) {
            grade = "B";
        }else if (marks >= 50 && marks <= 60) {
            grade = "C";
        } else{
            grade = "F";
        }

        System.out.println("Grade: "+ grade);
        sc.close();
    }
}