package com.tahahanci.ecommerce.entities;

public class Customer extends BaseEntity {

    private String customerName;
    private String customerMail;
    private String customerAddress;
    private String phoneNumber;

    public Customer(int id, String customerName, String customerMail, String customerAddress, String phoneNumber) {
        super(id);
        this.customerName = customerName;
        this.customerMail = customerMail;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
