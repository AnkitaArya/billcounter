package com.app.billcounter.dao.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;



@Entity
@Table(name="Product", uniqueConstraints = {@UniqueConstraint(columnNames = {"product_Id", "NAME"})})
public class ProductEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="product_Id")
    private String productId;

    @Column(name= "NAME")
    private String productName;

    @Column(name= "DESCRIPTION", columnDefinition = "TEXT")
    private String productDesc;

    @Column(name= "TAX_CATEGORY")
    private String taxCategory;

    @Column(name= "PRICE")
    private float price;


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(String taxCategory) {
        this.taxCategory = taxCategory;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
