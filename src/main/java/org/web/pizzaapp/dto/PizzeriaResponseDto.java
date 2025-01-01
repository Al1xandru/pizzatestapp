package org.web.pizzaapp.dto;

import org.web.pizzaapp.entity.Pizza;

import java.util.List;

public class PizzeriaResponseDto {

    private Long id;
    private String title;
    private String city;
    private String address;
    private String workTime;
    private List<Pizza> pizzas;

    public PizzeriaResponseDto() {
    }

    public PizzeriaResponseDto(Long id, String title, String city, String address, String workTime, List<Pizza> pizzas) {
        this.id = id;
        this.title = title;
        this.city = city;
        this.address = address;
        this.workTime = workTime;
        this.pizzas = pizzas;
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

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }
}
