package org.example.spring.cloud.spring.props;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "my.app.tryout")
@Component
public class AppProps {
    private String test1;
    private String test2;
    private String test3;
    private Integer port1;
    private Integer port2;
    private String version1;
    private String version2;

}

