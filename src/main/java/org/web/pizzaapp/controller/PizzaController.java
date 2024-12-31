package org.web.pizzaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.web.pizzaapp.converter.PizzaConverter;
import org.web.pizzaapp.dto.PizzaCreateDto;
import org.web.pizzaapp.dto.PizzaResponseDto;
import org.web.pizzaapp.entity.Pizza;
import org.web.pizzaapp.enums.PizzaSize;
import org.web.pizzaapp.repository.PizzaRepository;
import org.web.pizzaapp.service.PizzaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @Autowired
    private PizzaConverter<Pizza, PizzaCreateDto, PizzaResponseDto> createConverter;

    @PostMapping
    public PizzaResponseDto create(@RequestBody PizzaCreateDto pizzaCreateDto) {
        return createConverter.toDto(pizzaService.add(createConverter.toEntity(pizzaCreateDto)));
    }

    @GetMapping
    public List<PizzaResponseDto> getAll() {
        return pizzaService.getAllPizzas().stream()
                .map(pizza -> createConverter.toDto(pizza))
                .collect(Collectors.toList());
    }

    @DeleteMapping
    public void deleteById(@RequestParam Long id) {
        pizzaService.delete(id);
    }

    @GetMapping("/{id}")
    public PizzaResponseDto getPizzaById(@PathVariable Long id) {
        return createConverter.toDto(pizzaService.getPizzaById(id));
    }

    @GetMapping("/search")
    public PizzaResponseDto getPizzaByName(@RequestParam(name = "title") String name) {
        return createConverter.toDto(pizzaService.getPizzaByName(name));
    }

    @PutMapping ("/{id}")
    public PizzaResponseDto edit(@PathVariable Long id, @RequestParam(required = false) String description, @RequestParam(required = false) PizzaSize pizzaSize, @RequestParam(required = false) Double price){
        PizzaCreateDto pizzaCreateDto = new PizzaCreateDto(description, pizzaSize, price);
        Pizza pizza = pizzaService.edit(id, createConverter.toEntity(pizzaCreateDto));
        return createConverter.toDto(pizza);
    }

}
