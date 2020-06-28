package com.spring.react.gori.stylah.service;

import com.spring.react.gori.stylah.model.SalesPerson;
import com.spring.react.gori.stylah.repository.SalesPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesPersonService implements ISalesPersonService {

    @Autowired
    private SalesPersonRepository salesPersonRepository;


    @Override
    public List<SalesPerson> findAll() {
        return (List<SalesPerson>) salesPersonRepository.findAll();
    }

    @Override
    public void saveOrUpdate(SalesPerson salesPerson) {
        salesPersonRepository.save(salesPerson);
    }

    @Override
    public SalesPerson getSalesPersonById(Long id) {
        return salesPersonRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        salesPersonRepository.deleteById(id);
    }
}
