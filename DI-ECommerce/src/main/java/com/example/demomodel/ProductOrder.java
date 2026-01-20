package com.example.demomodel;

public class ProductOrder {

    private int orderId;
    private String productname;
    private int quantity;

    // mandatory no-arg constructor
    public ProductOrder() {}

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Order Id : " + orderId);
        System.out.println("Product Name : " + productname);
        System.out.println("Quantity : " + quantity);
    }
}
