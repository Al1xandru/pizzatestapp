package org.web.pizzaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.web.pizzaapp.entity.PriceList;

@Repository
public interface PriceListRepository extends JpaRepository<PriceList, Long> {

    @Query("SELECT p FROM PriceList p WHERE p.pizza.id = :pizzaId")
    PriceList findByPizzaId(Long pizzaId);

}
