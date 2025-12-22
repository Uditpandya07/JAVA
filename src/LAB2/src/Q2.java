//Aim of the program: Program to find no. of objects created out of a class using ‘static’
//modifier.

import javax.management.ObjectName;

class ObjectCounter {
    static int count = 0;
    public ObjectCounter(){
        count++;
    }
    public static int getCount(){
        return count;
    }
}

public class Q2{
    public static void main(String[] args) {
        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();

        System.out.println("No of objects created: "+ ObjectCounter.getCount());

    }
}