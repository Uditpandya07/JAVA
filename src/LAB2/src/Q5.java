/*Aim of the program : Write a program in java to input and display the details of n number
of students having roll, name and cgpa as data members. Also display the name of the
student having lowest cgpa.*/

import java.util.Scanner;

class student {
    int roll;
    String student;
    double cgpa;

    public student(int roll, String student, double cgpa) {
        this.roll = roll;
        this.student = student;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Roll: "+roll +"\t Student: "+student +"\tCGPA: "+cgpa);
    }
}
public class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        student[] Students = new student[n];
        System.out.println("\nEnter student details:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter CGPA: ");
            double cgpa = sc.nextDouble();

            Students[i] = new student(roll, name, cgpa);
        }

            System.out.println("\nStudent Details: ");
            for (int i = 0; i < n; i++) {
                Students[i].display();
            }

        student lowestCGPAStudent = Students[0];
        for (int i = 1; i < n; i++) {
            if (Students[i].cgpa < lowestCGPAStudent.cgpa) {
                lowestCGPAStudent = Students[i];
            }
        }
        System.out.println("\nStudent with Lowest CGPA ");
        System.out.println("Name: " + lowestCGPAStudent.student);
        System.out.println("Roll: " + lowestCGPAStudent.roll);
        System.out.println("CGPA: " + lowestCGPAStudent.cgpa);

        sc.close();
    }
}