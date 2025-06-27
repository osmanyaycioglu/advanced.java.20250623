package org.example.spring.cloud.spring;

import a.b.c.MyBean1;
import a.b.c.MyConfigGroup1;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MyConfigGroup1.class)
public class Application {
    // Field Injection
    @Autowired
    @Qualifier("merhaba1")
    private HelloBean helloBean;

    @Autowired
    private MyBean1 myBean1;

    private HelloBean helloBean2;

    private HelloBean helloBean3;


    // Constructor Injection
    @Autowired
    public Application(@Qualifier("helloBeanMethod")  final HelloBean helloBeanParam) {
        helloBean2 = helloBeanParam;
    }

    @PostConstruct
    public void abc() {
        // Init
    }

    @PreDestroy
    public void destroy(){
    }

    @Autowired
    public void method(@Qualifier("helloBeanMethod2") HelloBean test) {
        helloBean3 = test;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext contextLoc = SpringApplication.run(Application.class,
                                                                          args);


        Application applicationLoc = contextLoc.getBean(Application.class);
        String      sLoc           = applicationLoc.helloBean.sayHello("osman");
        System.out.println(sLoc);
    }

}
