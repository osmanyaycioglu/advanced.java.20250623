package org.example.spring.cloud.spring.java.java8.lab1;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder(setterPrefix = "with")
public class Person {
    private String name;
    private String surname;
    private Integer age;
}
