//Write a Java class which has a method called ProcessInput(). This method checks the number entered by the
//user. If the entered number is negative then throw a user defined exception called NegativeNumberException,
//otherwise it displays the double value of the entered number.

import java.util.Scanner;

class NegativeNumberException extends Exception{
    NegativeNumberException(String message){
        super(message);
    }
}

public class Q3 {
    void ProcessInput() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        try{
            if (num < 0){
                throw new NegativeNumberException("Number should be positive!");
            }
            else{
                System.out.println("Double value: " + (num*2));
            }
        }
        catch (NegativeNumberException e){
            System.out.println("Caught the exception!");
            System.out.println("Exception occurred: NegativeNumberException: "+e.getMessage());
        }
    }

    static void main(String[] args) {
        Q3 obj = new Q3();
        obj.ProcessInput();
    }
}