package org.example.spring.cloud.spring.rest.models;

import lombok.Data;

@Data
public class Response<T> {
    private T response;
    private boolean errorOccured;
    private String errorDesc;
    private Integer errorCode;
}
