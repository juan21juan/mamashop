package com.spring.react.gori.stylah.controller;

import com.spring.react.gori.stylah.model.Sale;
import com.spring.react.gori.stylah.service.ISalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalesController {
    @Autowired
    private ISalesService salesService;

    @PostMapping("/sales")
    private Long saveSales(@RequestBody Sale sale){
        salesService.saveOrUpdate(sale);

        return sale.getSalesId();
    }

    @GetMapping("/sales/{salesId}")
    private Sale getSalesById(@PathVariable("salesId") Long id){
        return salesService.getSalesById(id);
    }

    @GetMapping("/sales")
    private List<Sale> getSales(){
        return salesService.findAll();
    }

    @PutMapping("/sales")
    private Sale update(@RequestBody Sale sale){
        salesService.saveOrUpdate(sale);
        return sale;
    }

    @DeleteMapping("/sales/{salesId}")
    private void deleteSales(@PathVariable("salesId") Long id){
        salesService.delete(id);
    }
}
