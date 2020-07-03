package com.spring.react.gori.stylah.controller;

import com.spring.react.gori.stylah.model.Sale;
import com.spring.react.gori.stylah.model.SalesPerson;
import com.spring.react.gori.stylah.repository.SalesPersonRepository;
import com.spring.react.gori.stylah.service.ISalesPersonService;
import com.spring.react.gori.stylah.service.ISalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SalesPersonController {

    @Autowired
    private ISalesPersonService salesPersonService;

    @Autowired
    private ISalesService salesService;

    @Autowired
    private SalesPersonRepository salesPersonRepository;

    @PostMapping("/salesPersons/{salesPersonId}/sales")
    private Long createSalesForSalesPerson(@PathVariable Long salesPersonId, @RequestBody Sale sale){
        SalesPerson salesPerson = salesPersonRepository.getOne(salesPersonId);

        sale.setSalesPerson(salesPerson);
        salesService.saveOrUpdate(sale);

        return sale.getSalesId();
    }

    @PostMapping("/salesPersons")
    private Long saveSalesPerson(@RequestBody SalesPerson salesPerson){
        salesPersonService.saveOrUpdate(salesPerson);

        return salesPerson.getSalesPersonId();
    }

    @GetMapping("/salesPersons/{salesPersonId}")
    private SalesPerson getSalesPersonById(@PathVariable("salesPersonId") Long id){
        return salesPersonRepository.getOne(id);
    }

    @GetMapping("/salesPersons")
    private Iterable<SalesPerson> getSalesPerson(){
        return salesPersonService.findAll();
    }

    @PutMapping("/salesPersons")
    private SalesPerson update(@RequestBody SalesPerson salesPerson){
        salesPersonService.saveOrUpdate(salesPerson);
        return salesPerson;
    }

    @DeleteMapping("/salesPersons/{salesPersonId}")
    private void deleteSalesPerson(@PathVariable("salesPersonId") Long id){
        salesPersonService.delete(id);
    }
}
