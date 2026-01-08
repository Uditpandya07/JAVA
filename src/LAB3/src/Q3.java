//Aim of the program : Write a program in Java having three classes Apple, Banana and Cherry. Class Banana
//and Cherry are inherited from class Apple and each class have their own member function show() .
//Using Dynamic Method Dispatch concept display all the show() method of each class.

class Apple{
    void show(){
        System.out.println("This is Apple.");
    }
}
class Banana extends Apple{
    void show(){
        System.out.println("This is Banana.");
    }
}
class Cherry extends Apple{
    void show(){
        System.out.println("This is Cherry.");
    }
}

public class Q3 {
    static void main(String[] args) {
        Apple ref;

        ref = new Apple();
        ref.show();

        ref = new Banana();
        ref.show();

        ref = new Cherry();
        ref.show();
    }
}