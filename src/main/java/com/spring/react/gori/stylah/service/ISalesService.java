package com.spring.react.gori.stylah.service;


import com.spring.react.gori.stylah.model.Sale;

import java.util.List;

public interface ISalesService {
    List<Sale> findAll();

    void saveOrUpdate(Sale sale);

    Sale getSalesById(Long id);

    void delete(Long id);
}
