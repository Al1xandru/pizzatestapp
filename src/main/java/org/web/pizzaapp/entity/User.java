package org.web.pizzaapp.entity;

import jakarta.persistence.*;
import org.web.pizzaapp.enums.Role;

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

    @Enumerated(EnumType.STRING)
    private Role role = Role.ROLE_USER;

    public User() {
        //
    }

    public User(String email, String login, String password, String name, String surname) {
        this.email = email;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public List<DeliveryAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<DeliveryAddress> addresses) {
        this.addresses = addresses;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
