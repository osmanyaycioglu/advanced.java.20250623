package org.example.spring.cloud.spring.rest.error;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ErrorObj {
    private List<ErrorObj> subErrors;
    private String errorDesc;
    private int errorCode;


    @Builder(setterPrefix = "with")
    public ErrorObj(final String errorDescParam,
                    final int errorCodeParam,
                    List<ErrorObj> errorObjsParam) {
        errorDesc = errorDescParam;
        errorCode = errorCodeParam;
        subErrors = errorObjsParam;
    }
}
