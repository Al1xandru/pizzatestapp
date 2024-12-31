package org.web.pizzaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.web.pizzaapp.entity.PriceList;

@Repository
public interface PriceListRepository extends JpaRepository<PriceList, Long> {
}
