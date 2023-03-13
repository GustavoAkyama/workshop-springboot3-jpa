package com.akyama.sessao_23.repositories;

import com.akyama.sessao_23.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
