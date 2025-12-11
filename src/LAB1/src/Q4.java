//Aim of the program : Program to check a user entered number is palindrome or not

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = sc.nextInt();

        int original = n;
        if (n < 0){
            System.out.println(n + " is not a palindrome!");
            sc.close();
            return;
        }

        int reversed = 0;
        while(n!=0){
            int digit = n%10;
            reversed = reversed*10 + digit;
            n = n/10;
        }

        if (reversed == original){
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        sc.close();
    }
}