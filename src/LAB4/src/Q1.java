//Aim of the program -Illustrate the usage of abstract class with following Java classes –
// An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract
//method course()
// A subclass ‘kiitian’ with course() method implementation.Write the driver class to print the all
//details of a kiitian object.

abstract class Student {
    int rollno;
    long regno;

    void getinput(int r, long reg) {
        rollno = r;
        regno = reg;
    }
    abstract void course();
}
class Kiitian extends Student {
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}
public class Q1 {
    public static void main(String[] args){

    }
}