//Aim of the program -Write a program to print your name, roll no, section and branch in separate lines.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter Roll No: ");
        String roll = sc.nextLine();

        System.out.println("Enter Section: ");
        String section = sc.nextLine();

        System.out.println("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.println("\n Output:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);

        sc.close();
    }
}