package CoreSoftwarePrinciples.App.java.VioletOCP;

/**
 * Created by student on 2016/03/27.
 */
public class OrderFoodImpl_v implements OrderFood_v
{
    @Override
    public String getOrder() {
        return "Fish and chips";
    }

    @Override
    public String payOption(int opt) {
        String msg="";
        if(opt==1)
            msg = "Cash";
        else
            msg ="Card";
        return msg;
    }

}
