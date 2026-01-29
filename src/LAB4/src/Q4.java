/*Define an interface Employee with a method getDetails() to get employee
details as Empid and Ename. Also define a derived interface Manager with a method
getDeptDetails() to get department details such as Deptid and Deptname.Then define a class Head
which implements Manager interface and also prints all details of the employee. Write the complete
program to display all details of one head of the department.*/

import java.util.Scanner;
interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    int empid;
    String ename;
    int deptid;
    String deptname;

    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.print("Enter employee id - ");
        empid = sc.nextInt();
        sc.nextLine();   // clear buffer
        System.out.print("Enter employee name - ");
        ename = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter department id - ");
        deptid = sc.nextInt();
        sc.nextLine();   // clear buffer
        System.out.print("Enter department name - ");
        deptname = sc.nextLine();
    }

    void display() {
        System.out.println("Employee id - " + empid);
        System.out.println("Employee name - " + ename);
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }
}

// Driver Class
public class Q4 {
    public static void main(String args[]) {
        Head h = new Head();

        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}
