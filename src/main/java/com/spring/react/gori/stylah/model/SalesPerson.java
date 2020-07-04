package com.spring.react.gori.stylah.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class SalesPerson {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long salesPersonId;

    @Column(nullable = false)
    private String salesPersonName;

    @Column(nullable = false)
    private Date birthdate;

    @Column(nullable = false)
    private String gender;

    @OneToMany(mappedBy = "salesPerson", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Sale> saleList;

    public SalesPerson(){}

    public SalesPerson(String salesPersonName, Date birthdate, String gender) {
        this.salesPersonName = salesPersonName;
        this.birthdate = birthdate;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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
