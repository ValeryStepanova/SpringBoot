package org.example.config.components;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Profile("production")
public class ProductionBean {
    @PostConstruct
    public void init(){
        System.out.println("production bean created");
    }
}
