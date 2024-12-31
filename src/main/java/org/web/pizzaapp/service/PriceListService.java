package org.web.pizzaapp.service;

import org.web.pizzaapp.entity.PriceList;

public interface PriceListService {

    PriceList setPrice(Long pizzaId, double price);
}
