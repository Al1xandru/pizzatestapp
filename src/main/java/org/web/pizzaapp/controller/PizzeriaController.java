package org.web.pizzaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.web.pizzaapp.converter.Converter;
import org.web.pizzaapp.dto.PizzaCreateDto;
import org.web.pizzaapp.dto.PizzaResponseDto;
import org.web.pizzaapp.dto.PizzeriaCreateDto;
import org.web.pizzaapp.dto.PizzeriaResponseDto;
import org.web.pizzaapp.entity.Pizza;
import org.web.pizzaapp.entity.Pizzeria;
import org.web.pizzaapp.service.PizzeriaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pizzeria")
public class PizzeriaController {

    @Autowired
    private PizzeriaService service;

    @Autowired
    private Converter<Pizzeria, PizzeriaCreateDto, PizzeriaResponseDto> converter;

    @Autowired
    private Converter<Pizza, PizzaCreateDto, PizzaResponseDto> pizzaConverter;

    @GetMapping
    public List<PizzeriaResponseDto> getAll(){
        return service.getAllPizzeria().stream()
                .map(pizzeria -> converter.toDto(pizzeria))
                .collect(Collectors.toList());
    }

    @PostMapping
    public PizzeriaResponseDto create(@RequestBody PizzeriaCreateDto dto){
        return converter.toDto(service.add(converter.toEntity(dto)));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

    @DeleteMapping("/pizza")
    public void deletePizzaFromPizzeria(@RequestParam Long pizzaId, @RequestParam String pizzeeriaTitle){
        service.deletePizzaFromPizzeria(pizzaId, pizzeeriaTitle);
    }

    @PutMapping
    public PizzeriaResponseDto editWorkTime(@PathVariable String title, @RequestParam String workTime){
        return converter.toDto(service.editWorkTime(title, workTime));
    }

    @PutMapping("/addPizza")
    public PizzeriaResponseDto addPizza(@RequestParam String title, @RequestBody PizzaCreateDto dto){
        return converter.toDto(service.addPizzaToPizzeria(pizzaConverter.toEntity(dto), title));
    }

    @PutMapping("/addPizzaById")
    public PizzeriaResponseDto addPizza(@RequestParam String title, @RequestParam Long pizzaId){
        return converter.toDto(service.addPizzaToPizzeria(pizzaId, title));
    }

}
