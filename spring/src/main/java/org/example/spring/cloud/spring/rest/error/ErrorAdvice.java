package org.example.spring.cloud.spring.rest.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@RestControllerAdvice
public class ErrorAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handleException(MethodArgumentNotValidException exp) {
        return ErrorObj.builder()
                       .withErrorDescParam("Validation problem")
                       .withErrorCodeParam(1008)
                       .withErrorObjsParam(exp.getAllErrors()
                                              .stream()
                                              .map(seo -> ErrorObj.builder()
                                                                  .withErrorDescParam(seo.toString())
                                                                  .withErrorCodeParam(1009)
                                                                  .build())
                                              .collect(Collectors.toList()))
                       .build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorObj handleException(Exception exp) {
        return ErrorObj.builder()
                       .withErrorDescParam("Internal error : " + exp.getMessage())
                       .withErrorCodeParam(5000)
                       .build();
    }

}
