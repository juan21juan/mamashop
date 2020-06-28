package com.spring.react.gori.stylah.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String username;

    private String password;

    private String role;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "salesPersonId", nullable = false)
    @JsonIgnore
    private SalesPerson salesPerson;

    public Login(){}

    public Login(String username, String password, String role, SalesPerson salesPerson) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.salesPerson = salesPerson;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }
}
