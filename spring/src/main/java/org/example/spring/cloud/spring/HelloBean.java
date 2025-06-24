package org.example.spring.cloud.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("merhaba1")
@Scope("singleton")
public class HelloBean {
    private String prefix = "hello";

    public String sayHello(String name){
        return prefix  + " " + name;
    }

}
