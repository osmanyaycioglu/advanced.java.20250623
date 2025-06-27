package org.example.spring.cloud.spring.rest;


import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.spring.cloud.spring.java.services.OrderProcessService;
import org.example.spring.cloud.spring.rest.mappers.IOrderMapper;
import org.example.spring.cloud.spring.rest.models.OrderPlaceRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/order/process")
public interface IOrderProcessRestController {


    @PostMapping("/place")
    @ResponseStatus(HttpStatus.NON_AUTHORITATIVE_INFORMATION)
    @Operation(description = "deneme deneme deneme",summary = "deneme")
    public ResponseEntity<String> place(@Valid @RequestBody final OrderPlaceRequest orderParam) ;

    @PostMapping("/place2")
    public String place2(@RequestParam("name") String name) ;

}
