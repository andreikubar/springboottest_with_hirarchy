package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestWorksWithoutMock extends AbstractTest {

    @Autowired
    private ConfigurationA.MyBeanA myBeanA;

    @Test
    public void hierachyOnSuperClassButNoMocks() {
        System.out.println("loaded");
    }
}
