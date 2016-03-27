package CoreSoftwarePrinciples.App.java.ObeyOCP;

/**
 * Created by student on 2016/03/27.
 */
public abstract class OrderFoodImpl implements OrderFood
{
    @Override
    public String getOrder() {
        return "Fish and chips";
    }

    @Override
    public String pay() {
        return "Cash";
    }
}
