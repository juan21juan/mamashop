package com.spring.react.gori.stylah.controller;

import com.spring.react.gori.stylah.model.Sale;
import com.spring.react.gori.stylah.model.SalesPerson;
import com.spring.react.gori.stylah.service.ISalesPersonService;
import com.spring.react.gori.stylah.service.ISalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalesController {
    @Autowired
    private ISalesService salesService;
}
