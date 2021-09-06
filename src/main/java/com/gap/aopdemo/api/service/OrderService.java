package com.gap.aopdemo.api.service;

import com.gap.aopdemo.model.OrderCreateRequest;
import com.gap.aopdemo.model.OrderCreateResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public OrderCreateResponse create(OrderCreateRequest orderCreateRequest) {

        log.info("Processing the order");

        //Process

        return new OrderCreateResponse("SUCCESS");
    }

}
