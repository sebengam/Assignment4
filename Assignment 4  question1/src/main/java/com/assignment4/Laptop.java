package com.assignment4;

/**
 * Created by student on 2016/03/27.
 */
public class Laptop extends Computer
{


    private String c_type;

    public Laptop() {
    }

    public Laptop(String c_maker, String c_model, int c_year, String c_type)
    {
        super(c_maker, c_model, c_year);
        this.c_type = c_type;
    }

    public String getC_type()
    {
        return c_type;
    }

    public void setC_type(String c_type)
    {
        this.c_type = c_type;
    }

}
