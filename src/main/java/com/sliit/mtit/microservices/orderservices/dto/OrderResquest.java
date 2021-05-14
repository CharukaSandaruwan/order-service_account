package com.sliit.mtit.microservices.orderservices.dto;

import java.util.StringJoiner;

public class OrderResquest {

    private String fullName;
    private String age;
    private String orderType;
    private String orderDetails;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OrderResquest.class.getSimpleName() + "[", "]")
                .add("fullName='" + fullName + "'")
                .add("age='" + age + "'")
                .add("orderType='" + orderType + "'")
                .add("orderDetails='" + orderDetails + "'")
                .toString();
    }
}
