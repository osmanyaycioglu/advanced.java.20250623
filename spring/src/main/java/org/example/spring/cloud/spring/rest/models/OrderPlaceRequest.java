package org.example.spring.cloud.spring.rest.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class OrderPlaceRequest {
    @NotBlank
    @Size(min = 9,max = 13)
    private String      customerNumber;
    @Positive
    private Integer     postTime;
    @NotNull
    @Valid
    private MealRestObj meal;
}
