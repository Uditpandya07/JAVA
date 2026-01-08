//Aim of the program : Illustrate the execution of constructors in multi-level inheritance with three
//Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick)
//where box inherits from plate and woodbox inherits from box class. Each class has constructor where
//dimensions are taken from user.

import java.util.Scanner;

class Plate{
    double length, width;

    Plate(double l, double w ){
        length = l;
        width = w;
        System.out.println("Plate dimensions: " + length + " " + width);
    }
}
class Box extends Plate{
    double height;
    Box( double l, double w, double h){
        super(l,w);
        height = h;
        System.out.println("Box dimensions: " + length + " " + width + " " + height);
    }
}
class Woodbox extends Box{
    double thick;
    Woodbox(double l, double w, double h, double t){
        super(l,w,h);
        thick = t;
        System.out.println("Woodbox dimensions: " + length + " " + width + " " + height + " " + thick);
    }
}
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length, width, height, thickness: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double t = sc.nextDouble();

        new Woodbox(l,w,h,t);
    }
}
