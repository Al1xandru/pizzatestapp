package org.web.pizzaapp.dto;

public class PizzaLiteResponseDto {

    private String title;
    private Double price;

    public PizzaLiteResponseDto() {
    }

    public PizzaLiteResponseDto(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
