package com.tahahanci.ecommerce.entities;

public class Supplier extends BaseEntity {

    private String supplierName;
    private String supplierAddress;
    private String phoneNumber;
    private String supplierMail;
    private int productID;

    public Supplier(int id, String supplierName, String supplierAddress, String phoneNumber, String supplierMail, int productID) {
        super(id);
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.phoneNumber = phoneNumber;
        this.supplierMail = supplierMail;
        this.productID = productID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSupplierMail() {
        return supplierMail;
    }

    public void setSupplierMail(String supplierMail) {
        this.supplierMail = supplierMail;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
}
