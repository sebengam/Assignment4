package CoreSoftwarePrinciples.App.java.VioletSRP;

/**
 * Created by student on 2016/03/27.
 */
public abstract class EmployeeImpl implements Employee {
    @Override
    public int hoursWorked() {
        return 160;
    }

    @Override
    public double salary()
    {
        return hoursWorked()*120;
        }

}
