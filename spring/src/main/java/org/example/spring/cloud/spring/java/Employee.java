package org.example.spring.cloud.spring.java;

import lombok.Builder;
import lombok.Getter;

@Builder(setterPrefix = "with")
public class Employee {
    @Getter
    private String name;
    @Getter
    private String surname;
    @Getter
    private Integer age;

}
