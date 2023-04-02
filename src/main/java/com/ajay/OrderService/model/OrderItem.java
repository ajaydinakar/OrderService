package com.ajay.OrderService.model;

public class OrderItem {
    private int itemId;
    private double itemPrice;
    private String itemName;

    public OrderItem(int itemId, double itemPrice, String itemName) {
        super();
        this.itemId = itemId;
        this.itemPrice = itemPrice;
        this.itemName = itemName;
    }

    public OrderItem() {

    }

    public int getItemId() {
        return itemId;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
