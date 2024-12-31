package org.web.pizzaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.web.pizzaapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
