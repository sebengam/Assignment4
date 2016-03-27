package CoreSoftwarePrinciples.App.java.Config.TestLSP;

import CoreSoftwarePrinciples.App.java.Config.AppConfig;
import CoreSoftwarePrinciples.App.java.LSP.Computer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/27.
 */
public class FordTest
{
    private Computer ford;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ford =(Computer) ctx.getBean("ford");

    }

    @Test
    public void testFord() throws Exception {

        Assert.assertEquals(1,ford.processTimes());
    }
}
