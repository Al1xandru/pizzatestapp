package org.web.pizzaapp.service;

import org.web.pizzaapp.dto.PizzaCreateDto;
import org.web.pizzaapp.entity.Pizza;

import java.util.List;

public interface PizzaService {

    Pizza add(Pizza pizza);
    Pizza edit(Long id, Pizza pizza);
    void delete(Long id);
    List<Pizza> getAllPizzas();
    Pizza getPizzaById(Long id);
    String getPizzaNameById(Long id);
    String getPizzaDescriptionById(Long id);
    Pizza getPizzaByName(String pizzaName);
    Pizza getPizzaWithChecktPrice(Pizza pizza);
}
