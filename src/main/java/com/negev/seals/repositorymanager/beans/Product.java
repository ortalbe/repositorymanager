package com.negev.seals.repositorymanager.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int productID;
    private String productName;
    private double productPrice;
    private int productRepositoryQantity;
    private String productRepositoryLoacation;

    public Product() {
    }

    public Product(String productName, double productPrice, int productRepositoryQantity, String productRepositoryLoacation) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRepositoryQantity = productRepositoryQantity;
        this.productRepositoryLoacation = productRepositoryLoacation;
    }

    public Product(int id, String productName, double productPrice, int productRepositoryQantity, String productRepositoryLoacation) {
        this.productID=id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productRepositoryQantity = productRepositoryQantity;
        this.productRepositoryLoacation = productRepositoryLoacation;
    }


    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductRepositoryQantity() {
        return productRepositoryQantity;
    }

    public void setProductRepositoryQantity(int productRepositoryQantity) {
        this.productRepositoryQantity = productRepositoryQantity;
    }

    public String getProductRepositoryLoacation() {
        return productRepositoryLoacation;
    }

    public void setProductRepositoryLoacation(String productRepositoryLoacation) {
        this.productRepositoryLoacation = productRepositoryLoacation;
    }
}
