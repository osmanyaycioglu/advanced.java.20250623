package org.example.spring.cloud.spring.java;

import lombok.*;

@ToString
@EqualsAndHashCode
public class HelloJava {
    @Getter
    @Setter
    private String prefix = "hello";

    @Getter
    private Integer count;

    public String sayHello(String name){
        return prefix  + " " + name;
    }

}
