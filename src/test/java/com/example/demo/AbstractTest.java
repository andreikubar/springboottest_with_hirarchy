package com.example.demo;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextHierarchy({
        @ContextConfiguration(classes = ConfigurationB.class)
})
public abstract class AbstractTest extends SharedContext{
}
