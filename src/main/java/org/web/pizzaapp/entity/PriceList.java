package org.web.pizzaapp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "price_list")
public class PriceList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double price;
    private double discountForClients;

    public PriceList() {
        //
    }

    public PriceList(double price, double discountForClients) {
        this.price = price;
        this.discountForClients = discountForClients;
    }

    public PriceList(double price) {
        this.price = price;
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

    public double getDiscountForClients() {
        return discountForClients;
    }

    public void setDiscountForClients(double discountForClients) {
        this.discountForClients = discountForClients;
    }
}
