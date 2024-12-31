package org.web.pizzaapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.pizzaapp.entity.PriceList;
import org.web.pizzaapp.repository.PriceListRepository;

@Service
public class PriceListServiceImpl implements PriceListService {

    @Autowired
    private PriceListRepository priceListRepository;

    @Autowired
    private PizzaService pizzaService;

    @Override
    public PriceList setPrice(Long pizzaId, double price) {
        Long priceId = pizzaService.getPriceIdById(pizzaId);
        PriceList priceList = priceListRepository.findById(priceId).get();
        priceList.setPrice(price);
        return priceListRepository.save(priceList);
    }
}
