package org.web.pizzaapp.dto;

import org.web.pizzaapp.enums.PizzaSize;

public class PizzaResponseDto {

    private Long id;
    private double price;
    private String title;
    private PizzaSize size;
    private String description;

    public PizzaResponseDto(Long id, double price, String title, PizzaSize size, String description) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.size = size;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
