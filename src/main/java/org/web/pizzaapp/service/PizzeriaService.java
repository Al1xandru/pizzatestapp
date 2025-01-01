package org.web.pizzaapp.service;

import org.springframework.stereotype.Service;
import org.web.pizzaapp.entity.Pizza;
import org.web.pizzaapp.entity.Pizzeria;

import java.util.List;

public interface PizzeriaService {

    Pizzeria add(Pizzeria pizzeria);
    Pizzeria edit(Pizzeria pizzeria);
    void delete(Pizzeria pizzeria);
    void deleteById(Long id);
    Pizzeria addPizzaToPizzeria(Pizza pizza, String title);
    List<Pizzeria> getAllPizzeria();
    List<Pizza> getAllPizzasByPizzeriaTitle(String title);
    Pizzeria editWorkTime(String workTime, String title);
    Pizzeria addPizzaToPizzeria(Long pizzaId, String pizzeriatTitle);
    void deletePizzaFromPizzeria(Long pizzaId, String pizzeriaTitle);
}
