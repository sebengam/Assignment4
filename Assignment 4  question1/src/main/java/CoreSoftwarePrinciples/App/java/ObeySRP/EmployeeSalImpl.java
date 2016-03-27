package CoreSoftwarePrinciples.App.java.ObeySRP;

/**
 * Created by student on 2016/03/27.
 */
public class EmployeeSalImpl implements EmployeeSal {
    @Override
    public int hoursWorked() {
        return 160;
    }

    @Override
    public double salary() {
        return hoursWorked()*120;
    }
}
