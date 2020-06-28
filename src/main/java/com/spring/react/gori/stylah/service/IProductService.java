package com.spring.react.gori.stylah.service;


import com.spring.react.gori.stylah.model.Product;

import java.util.List;

public interface IProductService {
    public void saveOrUpdate(Product product);
    List<Product> findAll();
    Product getProductById(Long id);

    void delete(Long id);
}
