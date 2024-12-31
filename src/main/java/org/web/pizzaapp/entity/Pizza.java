package org.web.pizzaapp.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.web.pizzaapp.enums.PizzaSize;

@Entity
@Table(name = "pizza")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "price_id", referencedColumnName = "id")
    private PriceList price;
    private String title;
    private PizzaSize size;
    private String description;

    public Pizza() {
    }

    public Pizza(PriceList price, String title, PizzaSize size, String description) {
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

    public PriceList getPrice() {
        return price;
    }

    public void setPrice(PriceList price) {
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
