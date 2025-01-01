package org.web.pizzaapp.converter;

import org.springframework.stereotype.Component;
import org.web.pizzaapp.dto.PizzeriaCreateDto;
import org.web.pizzaapp.dto.PizzeriaResponseDto;
import org.web.pizzaapp.entity.Pizzeria;

@Component
public class PizzeriaConverterImpl implements Converter<Pizzeria, PizzeriaCreateDto, PizzeriaResponseDto>{

    @Override
    public PizzeriaResponseDto toDto(Pizzeria pizzeria) {
        return new PizzeriaResponseDto(
                pizzeria.getId(),
                pizzeria.getTitle(),
                pizzeria.getCity(),
                pizzeria.getAddress(),
                pizzeria.getWorkTime(),
                pizzeria.getPizzas()
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
