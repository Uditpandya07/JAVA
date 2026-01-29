package marketing;

import general.employee;

public class sales extends employee {
    public sales(int empid, String ename) {
        super(empid, ename);
    }

    public double tallowance(double totalEarnings) {
        return 0.05 * totalEarnings;
    }
}