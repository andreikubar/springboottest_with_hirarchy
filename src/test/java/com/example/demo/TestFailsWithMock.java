package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;


public class TestFailsWithMock extends AbstractTest{
    @MockBean
    private ConfigurationA.MyBeanA myBeanA;
    @Test
    public void hierarchyOnSuperClassWithMockBeanTest() {
        System.out.println("loaded");
    }

}
