package org.web.pizzaapp.converter;

import org.springframework.stereotype.Component;
import org.web.pizzaapp.dto.PizzaCreateDto;
import org.web.pizzaapp.dto.PizzaResponseDto;
import org.web.pizzaapp.entity.Pizza;
import org.web.pizzaapp.entity.PriceList;

@Component
public class PizzaConverterImpl implements Converter<Pizza, PizzaCreateDto, PizzaResponseDto> {

    @Override
    public PizzaResponseDto toDto(Pizza pizza) {
        return new PizzaResponseDto(pizza.getId(), pizza.getPrice().getPrice(), pizza.getTitle(), pizza.getSize(), pizza.getDescription());
    }

    @Override
    public Pizza toEntity(PizzaCreateDto pizzaCreateDto) {
        return new Pizza(new PriceList(pizzaCreateDto.getPrice()), pizzaCreateDto.getTitle(), pizzaCreateDto.getSize(), pizzaCreateDto.getDescription());
    }

    @Override
    public PizzaResponseDto toDto(Pizza pizza, String roleAuthority) {
        return null;
    }
}
