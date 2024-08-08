package org.example.config.components;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Conditional(RandomCondition.class)
public class RandomlyCreatedBean {
    @PostConstruct
    public void init() {
        System.out.println("Yeah!");
    }
}
