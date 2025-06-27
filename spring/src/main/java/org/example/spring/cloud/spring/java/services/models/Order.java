package org.example.spring.cloud.spring.java.services.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// Camel  orderProcess
// Pascal OrderProcess
// snake  order_process
// Kebap  order-process



@Entity
@Getter
@Setter
@Table(name = "order_process")
public class Order {
    @Id
    @GeneratedValue
    private Long orderId;

    private String customerNumber;
    private String orderProcessId;
    private Integer postTime;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "order")
    private Meal meal;

}
