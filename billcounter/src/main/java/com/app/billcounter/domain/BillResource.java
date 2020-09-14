package com.app.billcounter.domain;

import java.util.List;

public class BillResource {

    private List<ProductResource> products;
    private float totalCostWithTax;
    private float totalTax;
    private float totalCostWithoutTax;

    public List<ProductResource> getProducts() {
        return products;
    }

    public void setProducts(List<ProductResource> products) {
        this.products = products;
    }

    public float getTotalCostWithTax() {
        return totalCostWithTax;
    }

    public void setTotalCostWithTax(float totalCostWithTax) {
        this.totalCostWithTax = totalCostWithTax;
    }

    public float getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(float totalTax) {
        this.totalTax = totalTax;
    }

    public float getTotalCostWithoutTax() {
        return totalCostWithoutTax;
    }

    public void setTotalCostWithoutTax(float totalCostWithoutTax) {
        this.totalCostWithoutTax = totalCostWithoutTax;
    }
}
