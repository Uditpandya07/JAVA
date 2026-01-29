//Aim of the program -Write a program to perform following operations on user entered strings and a character –
//i) Change the case of the string
//ii) Reverse the string
//iii) Compare two strings
//iv) Insert one string into another string
//v) Convert the string to upper case and lower case
//vi) Check whether the character is present in the string and at which position
//vii) Check whether the string is palindrome or not.
//viii) Check the number of word, vowel and consonant in the string

import java.sql.SQLOutput;
import java.util.Scanner;
public class Q2{
    static void main() {
        Scanner sc = new Scanner(System.in);

        //change case:

        System.out.println("Enter the string:");
        String s1 = sc.nextLine();
        System.out.println("The string after changing the case is:\n" + s1.toUpperCase());

        //reverse string:

        String rev = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            rev += s1.charAt(i);
        }
        System.out.println("The string after reversing is :" + rev);

        //String comparison:

        System.out.println("Enter the second string for comparison: \n");
        String s2 = sc.nextLine();
        int diff = Math.abs(s1.compareTo(s2));
        System.out.println("The difference between ASCII values is:" + diff);

        //Insertion of one string into new string:

        System.out.println("Enter the new string:\n");
        String s3 = sc.nextLine();
        System.out.println("The string after insertion is: \n" + s1 + " " + s3);

        //Uppercase and Lowercase conversion:

        System.out.println("Enter a string: \n");
        String s4 = sc.nextLine();
        System.out.println("Uppercase: " + s4.toUpperCase());
        System.out.println("Lowercase: " + s4.toLowerCase());

        //Check character at position:

        System.out.println("Enter a string: \n");
        String s5 = sc.nextLine();
        System.out.println("Enter a character: \n");
        char ch = sc.next().charAt(0);

        int pos = s5.indexOf(ch);
        if (pos != -1) {
            System.out.println("Position of the entered character: " + pos);
        } else {
            System.out.println("Entered character is not present!");
        }
        sc.nextLine();

        //Palindrome check:

        System.out.println("Enter a string: \n");
        String s7 = sc.nextLine();
        String rev2 = new StringBuilder(s7).reverse().toString();

        if (s7.equals(rev2)) {
            System.out.println("Entered string is a palindrome!");
        } else {
            System.out.println("Entered string is not a palindrome!");
        }

        //Number of words, vowels and consonants:

        System.out.println("\n Enter a string:");
        String s8 = sc.nextLine();

        int words = s8.trim().split("\\s++").length;
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s8.length(); i++) {
            char c = Character.toLowerCase(s8.charAt(i));

            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of words: " + words);
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

    }
}
