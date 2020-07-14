package com.spring.react.gori.stylah.service;

import com.spring.react.gori.stylah.model.SalesPerson;

import java.util.List;

public interface ISalesPersonService {
    List<SalesPerson> findAll();

    void saveOrUpdate(SalesPerson salesPerson);

    void delete(Long id);

    boolean validateGender(String gender);
}
