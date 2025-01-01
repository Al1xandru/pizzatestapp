package org.web.pizzaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.web.pizzaapp.entity.PriceList;
import org.web.pizzaapp.service.PriceListService;

@RestController
@RequestMapping("/api/price")
public class PriceListController {

    @Autowired
    private PriceListService service;

    @PutMapping
    public PriceList editPrice(@RequestParam Long pizzaId, @RequestParam Double discount) {
        return service.editDiscount(pizzaId, discount);
    }
}
