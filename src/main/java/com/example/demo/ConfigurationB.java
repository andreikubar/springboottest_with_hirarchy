package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationB {

    @Bean
    public MyBeanB myBeanB() {
        System.out.println("constructing bean myBeanB");
        return new MyBeanB();
    }

    public static class MyBeanB {}
}
