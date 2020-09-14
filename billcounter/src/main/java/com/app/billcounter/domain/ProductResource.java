package com.app.billcounter.domain;

public class ProductResource {

    private String productId;
    private String productName;
    private String productDesc;
    private String taxCategory;
    private float taxRate;
    private float price;
    private float taxAmount;

    public ProductResource(String productId, String productName, String productDesc,
                           String taxCategory, float taxRate, float price, float taxAmount) {
        this.productId = productId;
        this.productName = productName;
        this.taxRate = taxRate;
        this.price = price;
        this.productDesc = productDesc;
        this.taxCategory = taxCategory;
        this.taxAmount = taxAmount;
    }

    public ProductResource(){

    }

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

    public float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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

    public float getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(float taxAmount) {
        this.taxAmount = taxAmount;
    }

	@Override
	public String toString() {
		return "ProductResource [productId=" + productId + ", productName=" + productName + ", productDesc="
				+ productDesc + ", taxCategory=" + taxCategory + ", taxRate=" + taxRate + ", price=" + price
				+ ", taxAmount=" + taxAmount + "]";
	}
}
