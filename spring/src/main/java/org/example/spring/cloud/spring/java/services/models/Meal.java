package org.example.spring.cloud.spring.java.services.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Data
@SequenceGenerator(name = "meal_seq", sequenceName = "meal_seq", initialValue = 1, allocationSize = 100)
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meal_seq")
    private Long   mealId;
    @NotBlank
    private String mealName;
    @Positive
    private Double mealPortion;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", nullable = false)
    @NotNull
    private Order  order;


}
