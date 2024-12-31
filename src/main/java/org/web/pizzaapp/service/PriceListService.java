package org.web.pizzaapp.service;

import org.web.pizzaapp.entity.PriceList;

public interface PriceListService {

    PriceList setPrice(Long pizzaId, double price);
    void delete(Long priceId);
    void delete(PriceList priceList);
    PriceList editDiscount(Long pizzaId, Double discount);
    Double getDiscountedPrice(Long pizzaId);

}
