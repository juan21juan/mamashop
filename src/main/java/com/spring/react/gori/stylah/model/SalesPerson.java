package com.spring.react.gori.stylah.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class SalesPerson {

    @Id
    @Column
    private Long salesPersonId;

    @Column
    private String salesPersonName;

    @Column
    private Integer age;

    @Column
    private String gender;

    @OneToMany(mappedBy = "salesPerson", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Sale> saleList;

    public SalesPerson(){}

    public SalesPerson(Long salesPersonId, String salesPersonName, Integer age, String gender) {
        this.salesPersonId = salesPersonId;
        this.salesPersonName = salesPersonName;
        this.age = age;
        this.gender = gender;
    }

    public Long getSalesPersonId() {
        return salesPersonId;
    }

    public void setSalesPersonId(Long salesPersonId) {
        this.salesPersonId = salesPersonId;
    }

    public String getSalesPersonName() {
        return salesPersonName;
    }

    public void setSalesPersonName(String salesPersonName) {
        this.salesPersonName = salesPersonName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Sale> getSaleList() {
        return saleList;
    }

    public void setSaleList(List<Sale> saleList) {
        this.saleList = saleList;
    }
}
