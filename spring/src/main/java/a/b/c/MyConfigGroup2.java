package a.b.c;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigGroup2 {

    @Bean
    public MyBean2 myBean2(){
        return new MyBean2();
    }

}
