package com.example.demo;


import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ConfigurationA.class})
public abstract class SharedContext {
}
