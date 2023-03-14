package com.akyama.sessao_23.repositories;

import com.akyama.sessao_23.entities.OrderItem;
import com.akyama.sessao_23.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
