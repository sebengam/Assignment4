package CoreSoftwarePrinciples.App.java.Config.TestOCP;

import CoreSoftwarePrinciples.App.java.Config.AppConfig;
import CoreSoftwarePrinciples.App.java.ObeyOCP.OrderFood;
import CoreSoftwarePrinciples.App.java.ObeyOCP.OrderFood2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/27.
 */
public class OrderFoodTest
{
    private OrderFood of;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        of = (OrderFood)ctx.getBean("order");
    }

    @Test
    public void testOrder() throws Exception {
        Assert.assertEquals("Card",((OrderFood2) of).payCard());

    }
}
