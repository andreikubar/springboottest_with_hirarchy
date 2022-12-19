package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;

@ContextHierarchy({
        @ContextConfiguration(classes = ConfigurationB.class)
})
public class TestWorksWithMock extends SharedContext{
    @MockBean
    private ConfigurationA.MyBeanA myBeanA;

    @Test
    public void hierarchyOnTestWithMockBeanClass() {

    }
}
