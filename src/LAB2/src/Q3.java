
//Aim of the program :Write a class file – box with three data members(length, width,height) and
//a method volume() . Also implement the application class Demo where an object of the box class
//is created with user entered dimensions and volume is printed.

import java.util.Scanner;

//BOX CLASS
class Box{
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double volume(){
        return length*width*height;
    }
}
//DEMO CLASS
public class Q3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        double length = sc.nextDouble();

        System.out.println("Enter the width: ");
        double width = sc.nextDouble();

        System.out.println("Enter the height: ");
        double height = sc.nextDouble();

        Box box = new Box(length , width, height);
        double volume = box.volume();

        System.out.println("Volume of the box: "+volume);
        sc.close();
    }
}