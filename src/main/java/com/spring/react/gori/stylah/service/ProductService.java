package com.spring.react.gori.stylah.service;

import com.spring.react.gori.stylah.model.Product;
import com.spring.react.gori.stylah.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void saveOrUpdate(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
