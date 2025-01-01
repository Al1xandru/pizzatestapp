package org.web.pizzaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.pizzaapp.entity.Pizzeria;

import java.util.Optional;

@Repository
public interface PizzeriaRepository extends JpaRepository<Pizzeria, Long> {

    Optional<Pizzeria> findByTitle(String title);
}
