package org.web.pizzaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.web.pizzaapp.entity.Pizza;

import java.util.Optional;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

    Optional<Pizza> findByTitle(String title);
}
