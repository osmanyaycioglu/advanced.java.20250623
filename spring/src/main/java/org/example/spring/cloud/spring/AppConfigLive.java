package org.example.spring.cloud.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("live")
@Configuration
public class AppConfigLive {

    @Bean
    public HelloBean helloBeanMethod(){
        return new HelloBean();
    }

    @Bean
    public HelloBean helloBeanMethod2(){
        return new HelloBean();
    }

}
