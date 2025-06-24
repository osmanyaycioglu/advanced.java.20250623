package org.example.spring.cloud.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class GoodbyeBean {
    private String prefix = "hello";

    public String sayGoodbye(String name){
        return prefix  + " " + name;
    }

}
