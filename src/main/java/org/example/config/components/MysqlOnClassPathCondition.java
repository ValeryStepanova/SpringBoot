package org.example.config.components;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MysqlOnClassPathCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            context.getClassLoader().loadClass("com.mysql.cj.jdbc.Driver");
            return true;
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
           return false;
        }

    }
}
