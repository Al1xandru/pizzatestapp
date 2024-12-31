package org.web.pizzaapp.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pizzaapp_users")
public class User {

    @Id // данное поле является первичным ключом
    @GeneratedValue(strategy = GenerationType.IDENTITY) // авто увеличение поля
    private Long id;

    private String email;
    private String login;
    private String password;
    private String name;
    private String surname;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "wallet_id", referencedColumnName = "id")
    private Wallet wallet;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<DeliveryAddress> addresses = new ArrayList<>();
}
