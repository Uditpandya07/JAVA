//Aim of the program: Write a program to print the week day for the given day no. of the current month using
//switch case statement

import java.util.Scanner;

public class Q3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number(1-7): ");
        int day = sc.nextInt();

        String dayName;
        switch (day) {
            case 1: dayName = "Sunday"; break;
            case 2: dayName = "Monday"; break;
            case 3: dayName = "Tuesday"; break;
            case 4: dayName = "Wednesday"; break;
            case 5: dayName = "Thursday"; break;
            case 6: dayName = "Friday"; break;
            case 7: dayName = "Saturday"; break;
            default: dayName = "Invalid day number"; break;
        }

        System.out.println("Weak day: "+dayName);
        sc.close();

    }
}