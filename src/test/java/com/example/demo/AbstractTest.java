package com.example.demo;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;

@ContextHierarchy({
        @ContextConfiguration(classes = ConfigurationB.class)
})
public abstract class AbstractTest extends SharedContext{
}
