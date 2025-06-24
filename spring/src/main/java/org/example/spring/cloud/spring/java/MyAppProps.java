package org.example.spring.cloud.spring.java;

import lombok.Data;

@Data
public class MyAppProps {
    @PropRead(prop = "app.name",intVal = 1)
    private String appName;
    @PropRead(prop = "app.port",intVal = 2)
    private Integer port;
    @PropRead(prop = "app.version",intVal = 3)
    private String appVersion;


    public void myMethod(String abc){
    }

}
