package com.gap.aopdemo.api.controller;

import com.gap.aopdemo.annotation.LogBusinessContext;
import com.gap.aopdemo.api.service.OrderService;
import com.gap.aopdemo.model.OrderCreateRequest;
import com.gap.aopdemo.model.OrderCreateResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final OrderService orderService;

    public OrderController(final OrderService orderService) {
        this.orderService = orderService;
    }

    @LogBusinessContext(type = OrderCreateRequest.class, fields = {"orderName", "process.id"})
    @PostMapping
    public ResponseEntity<OrderCreateResponse> create(@RequestBody OrderCreateRequest orderCreateRequest) {
        log.info("Request received");
        return new ResponseEntity<>(orderService.create(orderCreateRequest), HttpStatus.CREATED);
    }

}
