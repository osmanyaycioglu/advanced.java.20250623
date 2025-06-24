package org.example.spring.cloud.spring.java;

import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

public class JavaMain {

    public static void main(String[] args) {
        String stringLoc = "osman " + args.length;
        stringLoc += " deneme";
        System.out.println(stringLoc);
        Integer    a;
        BigDecimal b;

        HelloJava helloJavaLoc = new HelloJava();
        System.out.println("xyz");
        helloJavaLoc.setPrefix("merhaba");


        Employee employeeLoc = Employee.builder()
                                       .withName("osman")
                                       .withSurname("yay")
                                       .withAge(55)
                                       .build();


    }
}
