package org.web.pizzaapp.service;

import org.springframework.stereotype.Service;
import org.web.pizzaapp.entity.Pizza;
import org.web.pizzaapp.entity.Pizzeria;

import java.util.List;

public interface PizzeriaService {

    Pizzeria add(Pizzeria pizzeria);
    Pizzeria edit(Pizzeria pizzeria);
    void delete(Pizzeria pizzeria);
    Pizzeria addPizzaToPizzeria(Pizza pizza, String title);
    List<Pizzeria> getAllPizzeria();
    List<Pizza> getAllPizzasByPizzeriaTitle(String title);

}
