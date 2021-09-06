package com.gap.aopdemo.model;



public class OrderCreateResponse {

    private String result;

    public OrderCreateResponse() {
    }

    public OrderCreateResponse(String result) {
        this.result = result;
    }


    public String getResult() {
        return this.result;
    }

    @Override
    public String toString() {
        return "OrderCreateResponse{" +
                "result='" + result + '\'' +
                '}';
    }
}
