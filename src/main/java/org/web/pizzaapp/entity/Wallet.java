package org.web.pizzaapp.entity;

import jakarta.persistence.*;
import org.web.pizzaapp.enums.Currency;

@Entity
@Table(name = "wallets")
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private double amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;

}
