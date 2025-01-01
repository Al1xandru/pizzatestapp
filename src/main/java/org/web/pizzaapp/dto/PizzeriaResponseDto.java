package org.web.pizzaapp.dto;

import org.web.pizzaapp.entity.Pizza;

import java.util.List;

public class PizzeriaResponseDto {

    private Long id;
    private String title;
    private String city;
    private String address;
    private String workTime;
    private List<PizzaLiteResponseDto> pizzasLite;

    public PizzeriaResponseDto() {
    }

    public PizzeriaResponseDto(Long id, String title, String city, String address, String workTime, List<PizzaLiteResponseDto> pizzasLite) {
        this.id = id;
        this.title = title;
        this.city = city;
        this.address = address;
        this.workTime = workTime;
        this.pizzasLite = pizzasLite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public List<PizzaLiteResponseDto> getPizzasLite() {
        return pizzasLite;
    }

    public void setPizzasLite(List<PizzaLiteResponseDto> pizzasLite) {
        this.pizzasLite = pizzasLite;
    }
}
