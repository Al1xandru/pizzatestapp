package org.web.pizzaapp.converter;

import org.web.pizzaapp.dto.PizzaLiteResponseDto;
import org.web.pizzaapp.dto.PizzeriaResponseDto;
import org.web.pizzaapp.entity.Pizza;
import org.web.pizzaapp.entity.Pizzeria;

public interface Converter<Entity, RequestDto, ResponseDto> {
    ResponseDto toDto(Entity entity);
    Entity toEntity(RequestDto requestDto);
    ResponseDto toDto(Entity entity, String roleAuthority);
    PizzaLiteResponseDto toLiteDto(Pizza pizza);
}
