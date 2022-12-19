package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationA {

    @Bean
    public MyBeanA myBeanA() {
        System.out.println("constructing bean myBeanA");
        return new MyBeanA();
    }

    public static class MyBeanA{}
}
