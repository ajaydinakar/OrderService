package com.ajay.OrderService.model;

import java.util.Date;
import java.util.List;

public class Order {
    private String OrderId;
    private String CustomerId;
    private List<OrderItem> orderItems;

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    private Date orderDate;

    public Order(String orderId, String customerId, List<OrderItem> orderItems, Date orderDate) {
        super();
        this.OrderId = orderId;
        this.CustomerId = customerId;
        this.orderItems = orderItems;
        this.orderDate = orderDate;
    }

    public Order() {

    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
