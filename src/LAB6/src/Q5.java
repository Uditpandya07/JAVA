//Create a user defined exception named CheckArgument to check the number of arguments passed through
//command line. If the number of arguments is less than four then throw the Check Argument exception, else
//print the addition of squares of all the four elements.

import java.util.Scanner;

class CheckArgument extends Exception{
    CheckArgument(String message){
        super(message);
    }
}

public class Q5{
    public static void main(String[] args) {

        try {
            if (args.length < 4) {
                throw new CheckArgument("Check Argument");
            }

            int sum = 0;
            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num * num;
            }
            System.out.println(sum);
        }

        catch (CheckArgument e){
            System.out.println("Exception occurred: "+e.getMessage());
        }
        catch (NumberFormatException e){
            System.out.println("Invalid input - please enter integers only!");
        }
    }
}