package com.spring.react.gori.stylah.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @Column
    private Long productId;

    @Column
    private String productName;

    @Column
    private Float amount;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Sale> saleList;

    public Product(){}

    public Product(Long productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Sale> getSaleList() {
        return saleList;
    }

    public void setSaleList(List<Sale> saleList) {
        this.saleList = saleList;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
