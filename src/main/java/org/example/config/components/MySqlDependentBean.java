package org.example.config.components;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Conditional(MysqlOnClassPathCondition.class)
public class MySqlDependentBean {
    @PostConstruct
    public void init(){
        System.out.println("Sql bean created");
    }
}
