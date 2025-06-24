package a.b.c;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigGroup1 {

    @Bean
    public MyBean1 myBean1(){
        return new MyBean1();
    }

    @Bean
    public MyBean3 myBean3(){
        return new MyBean3();
    }


}
