package com.spring.react.gori.stylah.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Sale {

    @Id
    private Long salesId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "salesPersonId", nullable = false)
    @JsonIgnore
    private SalesPerson salesPerson;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "productId", nullable = false)
    @JsonIgnore
    private Product product;

    @Column
    private Date date;

    public Sale(){}

    public Sale(Long salesId, SalesPerson salesPerson, Product product, Date date) {
        this.salesId = salesId;
        this.salesPerson = salesPerson;
        this.product = product;
        this.date = date;
    }

    public Long getSalesId() {
        return salesId;
    }

    public void setSalesId(Long salesId) {
        this.salesId = salesId;
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
