package com.assignment4;

import com.assignment4.config.ApplicationConfiguration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/27.
 */


public class ComputerCompositionTest
{
    private ComputerComposition computer;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        computer = new ComputerComposition();
    }

    @Test
    public void testComputer() throws Exception
    {

        computer.setComputerComposition("Dell","D600",2015,"Desktop");
        Assert.assertSame("Desktop",computer.laptopComposition.getC_type());

    }

    @After
    public void tearDown() throws Exception {


    }
}
