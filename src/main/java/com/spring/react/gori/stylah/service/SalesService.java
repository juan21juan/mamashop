package com.spring.react.gori.stylah.service;

import com.spring.react.gori.stylah.model.Sale;
import com.spring.react.gori.stylah.repository.SalesRepository;
import com.spring.react.gori.stylah.utils.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService implements ISalesService {

    @Autowired
    private SalesRepository salesRepository;


    @Override
    public List<Sale> findAll() {
        return (List<Sale>) salesRepository.findAll();
    }

    @Override
    public void saveOrUpdate(Sale sale) {
        salesRepository.save(sale);
    }

    @Override
    public Sale getSalesById(Long id) {
        return salesRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        salesRepository.deleteById(id);
    }

}
