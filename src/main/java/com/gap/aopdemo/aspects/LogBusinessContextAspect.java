package com.gap.aopdemo.aspects;

import com.gap.aopdemo.model.OrderCreateRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Aspect
@Component
public class LogBusinessContextAspect {

    @Around("@annotation(com.gap.aopdemo.annotation.LogBusinessContext)")
    public Object logBusinessContext(ProceedingJoinPoint joinPoint) throws Throwable {

        try {
            Stream.of(joinPoint.getArgs())
                    .filter(OrderCreateRequest.class::isInstance)
                    .map(OrderCreateRequest.class::cast)
                    .map(OrderCreateRequest::getOrderNumber)
                    .findFirst()
                    .ifPresent(order -> MDC.put("orderNumber", " - orderNumber:" + order));

            return joinPoint.proceed();

        } finally {
            MDC.clear();
        }
    }
}
