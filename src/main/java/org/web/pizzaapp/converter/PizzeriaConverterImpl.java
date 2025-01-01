package org.web.pizzaapp.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.web.pizzaapp.dto.*;
import org.web.pizzaapp.entity.Pizza;
import org.web.pizzaapp.entity.Pizzeria;

@Component
public class PizzeriaConverterImpl implements Converter<Pizzeria, PizzeriaCreateDto, PizzeriaResponseDto>{

    @Autowired
    Converter<Pizza, PizzaCreateDto, PizzaResponseDto> pizzaConverter;

    @Override
    public PizzaLiteResponseDto toLiteDto(Pizza pizza) {
        return null;
    }

    @Override
    public PizzeriaResponseDto toDto(Pizzeria pizzeria) {
        return new PizzeriaResponseDto(
                pizzeria.getId(),
                pizzeria.getTitle(),
                pizzeria.getCity(),
                pizzeria.getAddress(),
                pizzeria.getWorkTime(),
                pizzeria.getPizzas().stream().map(pizza -> pizzaConverter.toLiteDto(pizza)).toList()
        );
    }

    @Override
    public Pizzeria toEntity(PizzeriaCreateDto pizzeriaCreateDto) {
        return new Pizzeria(
                pizzeriaCreateDto.getTitle(),
                pizzeriaCreateDto.getCity(),
                pizzeriaCreateDto.getAddress(),
                pizzeriaCreateDto.getWorkTime()
        );
    }

    @Override
    public PizzeriaResponseDto toDto(Pizzeria pizzeria, String roleAuthority) {
        return null;
    }
}
