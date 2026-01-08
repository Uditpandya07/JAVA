//Aim of the program : A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
//box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement
//it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits
//from 2D.

import java.util.Scanner;

class Plastic2D {
    double length, width;
    final double rate2D = 40;

    void getData(double l, double w){
        length = l;
        width = w;
    }
    double area() {
        return length * width;
    }
    double cost(){
        return rate2D * area();
    }
}

class Plastic3D extends Plastic2D{
    double height;
    final double rate3D = 60;

    void getData(double l, double w, double h) {
        super.getData(l, w);
        height = h;
    }
    double volume(){
        return area() * height;
    }
    double cost(){
        return rate3D * volume();
    }
}
public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width for the sheet:");
        double l = sc.nextDouble();
        double w = sc.nextDouble();

        Plastic2D p2 = new Plastic2D();
        p2.getData(l,w);
        System.out.println("Cost of 2D sheet = Rs" + p2.cost());

        System.out.println("Enter length , width and height for the box:");
        l = sc.nextDouble();
        w = sc.nextDouble();
        double h = sc.nextDouble();

        Plastic3D p3 = new Plastic3D();
        p3.getData(l,w,h);
        System.out.println("Cost of 3D box  = Rs"  + p3.cost());
    }
}