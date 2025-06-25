package org.example.spring.cloud.spring.java;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;


@Builder(setterPrefix = "with")
@ToString
@EqualsAndHashCode
public class Employee {
    @Getter
    private String name;
    @Getter
    private String surname;
    @Getter
    private Integer age;

}
