package com.spring.react.gori.stylah.controller;

import com.spring.react.gori.stylah.model.SalesPerson;
import com.spring.react.gori.stylah.service.ISalesPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SalesPersonController {

    @Autowired
    private ISalesPersonService salesPersonService;

    @PostMapping("/salesPersons")
    private Long saveSales(@RequestBody SalesPerson salesPerson){
        salesPersonService.saveOrUpdate(salesPerson);

        return salesPerson.getSalesPersonId();
    }

    @GetMapping("/salesPersons/{salesPersonId}")
    private SalesPerson getSalesById(@PathVariable("salesPersonId") Long id){
        return salesPersonService.getSalesPersonById(id);
    }

    @GetMapping("/salesPersons")
    private Iterable<SalesPerson> getSales(){
        return salesPersonService.findAll();
    }

    @PutMapping("/salesPersons")
    private SalesPerson update(@RequestBody SalesPerson salesPerson){
        salesPersonService.saveOrUpdate(salesPerson);
        return salesPerson;
    }

    @DeleteMapping("/salesPersons/{salesPersonId}")
    private void deleteSales(@PathVariable("salesPersonId") Long id){
        salesPersonService.delete(id);
    }
}
