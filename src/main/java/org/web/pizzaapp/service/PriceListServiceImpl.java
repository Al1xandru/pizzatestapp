package org.web.pizzaapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.pizzaapp.entity.PriceList;
import org.web.pizzaapp.repository.PriceListRepository;

@Service
public class PriceListServiceImpl implements PriceListService {

    @Autowired
    private PriceListRepository priceListRepository;

    @Override
    public PriceList setPrice(Long pizzaId, double price) {
        PriceList byPizzaId = priceListRepository.findByPizzaId(pizzaId);
        byPizzaId.setPrice(price);
        return priceListRepository.save(byPizzaId);
    }

    @Override
    public void delete(Long priceId) {
        priceListRepository.deleteById(priceId);
    }

    @Override
    public void delete(PriceList priceList) {
        priceListRepository.delete(priceList);
    }

    @Override
    public PriceList editDiscount(Long pizzaId, Double discount) {
        PriceList byPizzaId = priceListRepository.findByPizzaId(pizzaId);
        byPizzaId.setDiscountForClients(discount);
        return priceListRepository.save(byPizzaId);
    }

    @Override
    public Double getDiscountedPrice(Long pizzaId) {
        PriceList byPizzaId = priceListRepository.findByPizzaId(pizzaId);
        Double discount = byPizzaId.getDiscountForClients();
        Double price = byPizzaId.getPrice();
        if(discount != null && discount > 0) {
            return price - (price * discount / 100);
        }
        return price;
    }
}
