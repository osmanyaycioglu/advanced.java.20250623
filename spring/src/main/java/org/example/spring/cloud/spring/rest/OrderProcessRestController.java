package org.example.spring.cloud.spring.rest;


import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
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
@RequestMapping("/api/v1/order/process")
// CQRS Command Query Resp. Seg.
@RequiredArgsConstructor
public class OrderProcessRestController {

    // private List<String> strings = new Vector<>();

    private final TracingService tracingService;


    @PostMapping("/place")
    @ResponseStatus(HttpStatus.NON_AUTHORITATIVE_INFORMATION)
    public ResponseEntity<String> place(@RequestParam("name") String name) {
        tracingService.addName(name);
        return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION)
                             .header("deneme",
                                     "deneme1")
                             .body("OK");
    }

    @PostMapping("/place2")
    public String place2(@RequestParam("name") String name) {
        return "OK";
    }

}
