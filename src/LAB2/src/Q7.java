/*Aim of the program : Write a program in java using constructor overloading concept to
calculate the area of a rectangle having data member as length and breadth. Use default
constructor to initialize the value of the data member to zero and parameterized
constructor to initialize the value of data member according to the user input.*/
import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
        System.out.println("Default constructor called: length=0, breadth=0");
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("Parameterized constructor called: length=" + length + ", breadth=" + breadth);
    }

    public Rectangle(Rectangle rect) {
        this.length = rect.length;
        this.breadth = rect.breadth;
        System.out.println("Copy constructor called");
    }

    public double calculateArea() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Rectangle Area Calculator ===\n");

        System.out.println("1. Using Default Constructor:");
        Rectangle rect1 = new Rectangle();
        System.out.print("Area of rectangle with default values: ");
        rect1.display();

        System.out.println("\n2. Using Parameterized Constructor:");
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();

        Rectangle rect2 = new Rectangle(length, breadth);
        System.out.print("\nRectangle details: ");
        rect2.display();

        System.out.println("\n3. Using Copy Constructor:");
        Rectangle rect3 = new Rectangle(rect2);
        System.out.print("Copied rectangle details: ");
        rect3.display();

        System.out.println("\n4. Create another rectangle with user input:");
        System.out.print("Enter length: ");
        double len = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double brd = scanner.nextDouble();

        Rectangle rect4 = new Rectangle(len, brd);
        System.out.println("\nFinal Rectangle Details:");
        rect4.display();

        scanner.close();
    }
}