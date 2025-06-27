package org.example.spring.cloud.spring.java.db;

import lombok.Data;

@Data
public class MySomeObj {

    private Long   xyz;
    private String abc;

    public MySomeObj(Long xyz,
                     String abc) {
        this.xyz = xyz;
        this.abc = abc;
    }

    public MySomeObj() {
    }
}

