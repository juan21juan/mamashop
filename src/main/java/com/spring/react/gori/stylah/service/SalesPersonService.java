package com.spring.react.gori.stylah.service;

import com.spring.react.gori.stylah.model.SalesPerson;
import com.spring.react.gori.stylah.repository.SalesPersonRepository;
import com.spring.react.gori.stylah.utils.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
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
    public void delete(Long id) {
        salesPersonRepository.deleteById(id);
    }

    @Override
    public boolean validateGender(String gender) {
        boolean isValid = false;

        if(Arrays.asList("MALE","FEMALE").contains(gender.toUpperCase())){
            isValid = true;
        }

        return isValid;
    }


}
