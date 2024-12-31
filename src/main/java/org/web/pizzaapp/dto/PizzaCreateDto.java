package org.web.pizzaapp.dto;

import org.web.pizzaapp.enums.PizzaSize;

public class PizzaCreateDto {

    private Double price;
    private String title;
    private PizzaSize size;
    private String description;

    public PizzaCreateDto(String description, PizzaSize size, Double price) {
        this.description = description;
        this.size = size;
        this.price = price;
    }

    public PizzaCreateDto(Double price, String title, PizzaSize size, String description) {
        this.price = price;
        this.title = title;
        this.size = size;
        this.description = description;
    }

    public PizzaCreateDto() {
        //
    }

    public Double getPrice() {
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
