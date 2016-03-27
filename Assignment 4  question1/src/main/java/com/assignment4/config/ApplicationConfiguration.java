package com.assignment4.config;
import com.assignment4.Computer;
import com.assignment4.Laptop;
import org.springframework.context.annotation.Bean;

//import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2016/03/27.
 */
public class ApplicationConfiguration
{
    @Bean(name ="Gaming Laptop")
    public Computer getComputer()
    {
        return new Laptop();
    }

}


