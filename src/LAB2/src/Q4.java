/*Aim of the program : Write a program in Java to create a class Rectangle having data members length and
breadth and three methods called read, calculate and display to read the values of length and breadth,
calculate the area and perimeter of the rectangle and display the result respectively.*/

import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.Scanner;

class rectangle{
    private double length;
    private double breadth;

    public void read(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        this.length = sc.nextDouble();

        System.out.println("Enter the breadth of the rectangle: ");
        this.breadth = sc.nextDouble();
    }
    public double calculateArea(){
        return length*breadth;
    }
    public double calculatePerimeter(){
        return 2*(length + breadth);
    }
    public void display(){
        double area = calculateArea();
        double perimeter = calculatePerimeter();

        System.out.println("\n Rectangle details: ");
        System.out.println("Length of rectangle: "+ length);
        System.out.println("Breadth of rectangle: "+ breadth);
        System.out.println("Area : "+ area);
        System.out.println("Perimeter : "+ perimeter);
    }
}

//DEMO CLASS
public class Q4{
    public static void main(String[] args){
        rectangle rect = new rectangle();
        rect.read();
        rect.display();
    }
}
