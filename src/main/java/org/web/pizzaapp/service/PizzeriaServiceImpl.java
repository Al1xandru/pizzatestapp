package org.web.pizzaapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.pizzaapp.entity.Pizza;
import org.web.pizzaapp.entity.Pizzeria;
import org.web.pizzaapp.exception.PizzeriaNotFoundException;
import org.web.pizzaapp.repository.PizzeriaRepository;

import java.util.List;

@Service
public class PizzeriaServiceImpl implements PizzeriaService {

    @Autowired
    private PizzeriaRepository repository;

    @Override
    public Pizzeria add(Pizzeria pizzeria) {
        return repository.save(pizzeria);
    }

    @Override
    public Pizzeria edit(Pizzeria pizzeria) {
        return null;
    }

    @Override
    public void delete(Pizzeria pizzeria) {
        repository.delete(pizzeria);
    }

    @Override
    public Pizzeria addPizzaToPizzeria(Pizza pizza, String title) {
        Pizzeria pizzeria = getByTitleCheckt(title);
        pizzeria.addPizza(pizza);
        return repository.save(pizzeria);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Pizzeria> getAllPizzeria() {
        return repository.findAll();
    }

    @Override
    public List<Pizza> getAllPizzasByPizzeriaTitle(String title) {
        Pizzeria pizzeria = getByTitleCheckt(title);
        return pizzeria.getPizzas();
    }

    @Override
    public Pizzeria editWorkTime(String workTime,String title) {
        Pizzeria pizzeria = getByTitleCheckt(title);
        pizzeria.setWorkTime(workTime);
        return repository.save(pizzeria);
    }

    public Pizzeria getByTitleCheckt(String title) {
        return repository.findByTitle(title).orElseThrow(() ->
                new PizzeriaNotFoundException("Pizzeria with title" + title + " not found"));
    }
}
