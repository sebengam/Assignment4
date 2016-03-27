package CoreSoftwarePrinciples.App.java.LSP;

/**
 * Created by student on 2016/03/27.
 */
public abstract class computerDell implements Computer
{
    int process = 0;
    @Override
    public String computerName() {
        return "Dell";
    }

    @Override
    public int processTimes() {
        return ++process ;
    }
}
