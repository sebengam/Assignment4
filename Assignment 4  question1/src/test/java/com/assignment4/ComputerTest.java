package com.assignment4;

/**
 * Created by student on 2016/03/27.
 */

import com.assignment4.config.ApplicationConfiguration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ComputerTest
{
    private Laptop laptop;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        laptop = (Laptop)ctx.getBean("Gaming Laptop");

    }

    @Test
    public void testComputer() throws Exception {

        Laptop moreLaptop = new Laptop("ASUS","X550C",2013,"Desktop");

        laptop.setC_maker("ASUS");
        laptop.setC_model("X550C");
        laptop.setC_year(2013);
        laptop.setC_type("Desktop");

        Assert.assertSame(laptop.getC_type(), moreLaptop.getC_type());
    }

    @After
    public void tearDown() throws Exception {


    }
}
