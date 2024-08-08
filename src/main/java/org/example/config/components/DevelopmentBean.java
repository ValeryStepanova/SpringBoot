package org.example.config.components;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
@Profile("development")
public class DevelopmentBean {
    @PostConstruct
    public void init(){
        System.out.println("development bean created");
    }
}
