package org.web.pizzaapp.converter;

import org.web.pizzaapp.dto.PizzaResponseDto;
import org.web.pizzaapp.entity.Pizza;

public interface PizzaConverter <Entity, RequestDto, ResponseDto> {
    ResponseDto toDto(Entity entity);
    Entity toEntity(RequestDto requestDto);
}
