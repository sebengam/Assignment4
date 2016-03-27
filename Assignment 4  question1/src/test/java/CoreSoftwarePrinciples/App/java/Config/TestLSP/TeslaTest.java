package CoreSoftwarePrinciples.App.java.Config.TestLSP;

import CoreSoftwarePrinciples.App.java.Config.AppConfig;
import CoreSoftwarePrinciples.App.java.LSP.Computer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/27.
 */
public class TeslaTest
{
    private Computer tesla;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        tesla = (Computer) ctx.getBean("tesla");
    }

    @Test
    @Ignore
    public void testTesla() throws Exception {
        Assert.assertNotEquals(1,tesla.processTimes());
    }

}
