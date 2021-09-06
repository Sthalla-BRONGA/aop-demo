package com.gap.aopdemo.model;

public class OrderCreateRequest {

    private String orderNumber;
    private String market;

    public OrderCreateRequest() {
    }

    public OrderCreateRequest(String orderNumber, String market) {
        this.orderNumber = orderNumber;
        this.market = market;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    @Override
    public String toString() {
        return "OrderCreateRequest{" +
                "orderNumber='" + orderNumber + '\'' +
                ", market='" + market + '\'' +
                '}';
    }
}
