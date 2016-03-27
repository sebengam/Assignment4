package com.assignment4;


    /**
     * Created by student on 2016/03/27.
     */
    public class Computer
    {

        private String c_maker;
        private String c_model;
        private int c_year;

        public Computer()
        {
        }

        public Computer(String c_maker, String c_model, int c_year)
        {
            this.c_maker = c_maker;
            this.c_model = c_model;
            this.c_year = c_year;
        }

        public String getC_maker()
        {
            return c_maker;
        }

        public void setC_maker(String c_maker)
        {
            this.c_maker = c_maker;
        }

        public String getC_model()
        {
            return c_model;
        }

        public void setC_model(String c_model)
        {
            this.c_model = c_model;
        }

        public int getC_year()
        {
            return c_year;
        }

        public void setC_year(int c_year)
        {
            this.c_year = c_year;
        }
    }

