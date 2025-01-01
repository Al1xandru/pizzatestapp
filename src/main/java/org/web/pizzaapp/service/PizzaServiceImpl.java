package org.web.pizzaapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.pizzaapp.dto.PizzaCreateDto;
import org.web.pizzaapp.entity.Pizza;
import org.web.pizzaapp.entity.PriceList;
import org.web.pizzaapp.exception.PizzaNotFoundException;
import org.web.pizzaapp.repository.PizzaRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository repository;

    @Autowired
    private PriceListService priceListService;

    @Autowired
    private UserService userService;

    @Override
    public Pizza add(Pizza pizza) {
        return repository.save(pizza);
    }

    @Override
    public Pizza getPizzaByName(String title) {
        Pizza pizza = repository.findByTitle(title)
                .orElseThrow(() -> new PizzaNotFoundException("Pizza with title " + title + " not found"));
        return getPizzaWithChecktPrice(pizza);
    }

    @Override
    public Pizza getPizzaById(Long id) {
        Pizza pizza = repository.findById(id)
                .orElseThrow(() -> new PizzaNotFoundException("Pizza with id " + id + " not found"));
        return getPizzaWithChecktPrice(pizza);
    }

    @Override
    public Pizza edit(Long id, Pizza pizza) {
        Pizza currentPizza = getPizzaById(id);
        if(pizza.getDescription() != null){currentPizza.setDescription(pizza.getDescription());}
        if(pizza.getSize() != null){currentPizza.setSize(pizza.getSize());}
        if(pizza.getPrice().getPrice() != null){priceListService.setPrice(id, pizza.getPrice().getPrice());}
        return repository.save(currentPizza);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Pizza> getAllPizzas() {
        if(userService.getAuthenticatedStatus()) {
            return repository.findAll().stream()
                    .map(this::getPizzaWithChecktPrice)
                    .collect(Collectors.toList());
        }
        return repository.findAll();
    }

    @Override
    public String getPizzaNameById(Long id) {
        return getPizzaById(id).getTitle().toString();
    }

    @Override
    public String getPizzaDescriptionById(Long id) {
        return getPizzaById(id).getDescription().toString();
    }

    @Override
    public Pizza getPizzaWithChecktPrice(Pizza pizza) {
        if(userService.getAuthenticatedStatus()){
            Double discountedPrice = priceListService.getDiscountedPrice(pizza.getId());
            pizza.getPrice().setPrice(discountedPrice);
            return pizza;
        }
        return pizza;
    }
}
