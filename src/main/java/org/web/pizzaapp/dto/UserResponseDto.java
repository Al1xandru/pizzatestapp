package org.web.pizzaapp.dto;

import org.web.pizzaapp.entity.DeliveryAddress;
import org.web.pizzaapp.entity.Wallet;

import java.util.List;

public class UserResponseDto {

    private Long id;
    private String email;
    private String login;
    private String password;
    private String name;
    private String surname;
    private Wallet wallet;
    private List<DeliveryAddress> addresses;

    public UserResponseDto(Long id, String email, String login, String password, String name, String surname, Wallet wallet, List<DeliveryAddress> addresses) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.wallet = wallet;
        this.addresses = addresses;
    }

    public UserResponseDto(String email, String name, String surname) {
        this.email = email;
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
}
