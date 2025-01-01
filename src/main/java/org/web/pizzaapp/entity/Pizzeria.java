package org.web.pizzaapp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pizzeria")
public class Pizzeria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String city;
    private String address;
    private String workTime;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pizzas_id", referencedColumnName = "id")
    private List<Pizza> pizzas;

    public Pizzeria() {
    }

    public Pizzeria(String title, String city, String address, String workTime) {
        this.title = title;
        this.city = city;
        this.address = address;
        this.workTime = workTime;
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public void deletePizza(Pizza pizza) {
        this.pizzas.remove(pizza);
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

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

}
