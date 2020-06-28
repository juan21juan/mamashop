package com.spring.react.gori.stylah.service;

import com.spring.react.gori.stylah.model.SalesPerson;

import java.util.List;

public interface ISalesPersonService {
    List<SalesPerson> findAll();

    void saveOrUpdate(SalesPerson salesPerson);

    SalesPerson getSalesPersonById(Long id);

    void delete(Long id);
}
