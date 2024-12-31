package org.web.pizzaapp.converter;

public interface Converter<Entity, RequestDto, ResponseDto> {
    ResponseDto toDto(Entity entity);
    Entity toEntity(RequestDto requestDto);
    ResponseDto toDto(Entity entity, String roleAuthority);
}
