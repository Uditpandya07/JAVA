//Write a program to create user defined exceptions called HrsException, MinException and SecException.
//Create a class Time which contains data members hours, minutes, seconds and a method to take a time from
//user which throws the user defined exceptions if hours (>24 & <0),minutes(>60 <0),
//seconds(>60 & <0).

import java.util.Scanner;

class HrsException extends Exception{
    HrsException(String message){
        super(message);
    }
}

class MinException extends Exception{
    MinException(String message){
        super(message);
    }
}

class SecException extends Exception{
    SecException(String message){
        super(message);
    }
}

class time {
   int hours;
   int minutes;
   int seconds;

   public void takeUserInput() throws HrsException, MinException, SecException{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the hours: ");
       int hrs = sc.nextInt();

       if(hrs>0 && hrs<= 24){
           this.hours = hrs;
       }else{
           throw new HrsException("Hours must be between 0 to 24!");
       }

       System.out.println("Enter the minutes: ");
       int min = sc.nextInt();

       if(min>0 && min<= 59){
           this.minutes = min;
       }else{
           throw new MinException("Minutes must be between 0 to 60!");
       }

       System.out.println("Enter the seconds: ");
       int sec = sc.nextInt();

       if(sec>0 && sec<= 59){
           this.seconds = sec;
       }else{
           throw new SecException("Hours must be between 0 to 60!");
       }
   }
}

public class Q4{
    static void main(String[] args) {
        try{
            time t = new time();
            t.takeUserInput();

            System.out.println("Correct time : "+t.hours+ ":"+t.minutes+":"+t.seconds);
        }
        catch (HrsException | MinException | SecException e){
            System.out.println("Caught the exception!");
            System.out.println("Exception Occurred: "+ e.toString());
        }
    }
}



