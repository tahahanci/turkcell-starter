package com.tahahanci.ecommerce.entities;

import java.util.Date;

public class Order extends BaseEntity {

    private Date orderDate;
    private int customerID;
    private double totalAmount;

    public Order(int id, Date orderDate, int customerID, double totalAmount) {
        super(id);
        this.orderDate = orderDate;
        this.customerID = customerID;
        this.totalAmount = totalAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
