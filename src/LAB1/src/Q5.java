/*Aim of the program : Write a program in Java to take first name and last name from user and
print both in one line as last name followed by first name*/

import java.util.Scanner;
public class Q5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String first = sc.next();

        System.out.println("Enter your last name:");
        String last = sc.next();

        System.out.println(last + " " + first);
        sc.close();

    }
}

