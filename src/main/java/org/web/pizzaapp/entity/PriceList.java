package org.web.pizzaapp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "price_list")
public class PriceList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double price;
    private double discountForClients;

    @OneToOne(mappedBy = "price", cascade = CascadeType.ALL)
    private Pizza pizza;

    @Column(name = "pizza_id", insertable = false, updatable = false)
    private Long pizzaId;

    public PriceList() {
        //
    }

    public PriceList(Double price, double discountForClients) {
        this.price = price;
        this.discountForClients = discountForClients;
    }

    public PriceList(Double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
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
