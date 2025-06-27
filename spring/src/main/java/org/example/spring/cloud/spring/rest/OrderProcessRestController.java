package org.example.spring.cloud.spring.rest;


import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.spring.cloud.spring.java.java8.lab1.Person;
import org.example.spring.cloud.spring.java.services.OrderProcessService;
import org.example.spring.cloud.spring.java.services.models.Order;
import org.example.spring.cloud.spring.rest.mappers.IOrderMapper;
import org.example.spring.cloud.spring.rest.models.OrderPlaceRequest;
import org.example.spring.cloud.spring.rest.models.Response;
import org.example.spring.cloud.spring.services.TracingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@RestController
// CQRS Command Query Resp. Seg.
@RequiredArgsConstructor
public class OrderProcessRestController implements IOrderProcessRestController{
    private final OrderProcessService orderProcessService;
    // private List<String> strings = new Vector<>();

    // private final TracingService tracingService;


    public ResponseEntity<String> place(@Valid @RequestBody final OrderPlaceRequest orderParam) {
        orderProcessService.processOrder(IOrderMapper.INSTANCE.toOrder(orderParam));
        return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION)
                             .header("deneme",
                                     "deneme1")
                             .body("OK");
    }

    public String place2(@RequestParam("name") String name) {
        return "OK";
    }

}
