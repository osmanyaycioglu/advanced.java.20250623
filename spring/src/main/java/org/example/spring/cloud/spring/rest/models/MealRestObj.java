package org.example.spring.cloud.spring.rest.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class MealRestObj {
    @NotBlank
    private String mealName;
    @Positive
    private Double mealPortion;

}
