package org.web.pizzaapp.service;

import org.web.pizzaapp.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User getById(Long id);
    User create(User user);
    User getByLogin(String login);
    void delete(Long id);
    String getCurrentLogin();
    Long getCurrentUserId();
    String getCurrentUserRole();
}
