package org.example.spring.cloud.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
public class AppConfig {

    @Bean
    public HelloBean helloBeanMethod(){
        return new HelloBean();
    }

    @Bean
    public HelloBean helloBeanMethod2(){
        return new HelloBean();
    }

}
