package CoreSoftwarePrinciples.App.java.VioletLSP;

import CoreSoftwarePrinciples.App.java.LSP.Computer;

/**
 * Created by student on 2016/03/27.
 */
public class ComputerTestDell implements Computer
{
    int process=0;
    @Override
    public String computerName() {
        return "Dell";
    }

    @Override
    public int processTimes() {
        throw new UnsupportedOperationException() ;
    }
}

