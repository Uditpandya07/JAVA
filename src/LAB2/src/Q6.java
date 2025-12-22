/*Aim of the program : Write a program to overload subtract method with various
parameters in a class in Java. Write the driver class to use the different subtract methods
using object.*/
import java.util.Scanner;

class calculator{
    public int subtract(int a, int b){
        System.out.println("Subtracting two numbers: "+ a +"-" + b);
        return a - b;
    }
    public int subtract(int a, int b, int c) {
        System.out.println("Subtracting three integers: " + a + " - " + b + " - " + c);
        return a - b - c;
    }
    public double subtract(double a, double b) {
        System.out.println("Subtracting two doubles: " + a + " - " + b);
        return a - b;
    }
    public double subtract(double a, double b, double c) {
        System.out.println("Subtracting three doubles: " + a + " - " + b + " - " + c);
        return a - b - c;
    }
    public int subtract(int[] numbers) {
        System.out.print("Subtracting array of integers: " + numbers[0]);
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            System.out.print(" - " + numbers[i]);
            result -= numbers[i];
        }
        System.out.println();
        return result;
    }
}
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculator calc = new calculator();

        // Test different subtract methods
        System.out.println("1. Subtract two integers:");
        System.out.print("Enter first integer: ");
        int a1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b1 = scanner.nextInt();
        int result1 = calc.subtract(a1, b1);
        System.out.println("Result: " + result1);

        System.out.println("\n2. Subtract three integers:");
        System.out.print("Enter first integer: ");
        int a2 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b2 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int c2 = scanner.nextInt();
        int result2 = calc.subtract(a2, b2, c2);
        System.out.println("Result: " + result2);

        System.out.println("\n3. Subtract two doubles:");
        System.out.print("Enter first double: ");
        double a3 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double b3 = scanner.nextDouble();
        double result3 = calc.subtract(a3, b3);
        System.out.println("Result: " + result3);

        System.out.println("\n4. Subtract three doubles:");
        System.out.print("Enter first double: ");
        double a4 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double b4 = scanner.nextDouble();
        System.out.print("Enter third double: ");
        double c4 = scanner.nextDouble();
        double result4 = calc.subtract(a4, b4, c4);
        System.out.println("Result: " + result4);

        System.out.println("\n5. Subtract array of integers:");
        System.out.print("How many numbers in array? ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int result5 = calc.subtract(numbers);
        System.out.println("Result: " + result5);

        System.out.println("\n=== All Operations Completed ===");
        scanner.close();
    }
}