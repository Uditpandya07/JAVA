//Aim of the program : Accept 10 numbers from command line and check how many of them are
//even and how many are odd.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 number:");
        int even = 0;
        int odd = 0;

        for(int i = 0; i<10; i++){
            System.out.println("Enter number " + i+1 + ":");
            int num = scanner.nextInt();

            if(num % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.printf("\nRESULT:");
        System.out.println("Number of even numbers: "+ even );
        System.out.println("Number of odd numbers: "+ odd);

    }
}
