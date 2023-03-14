package com.akyama.sessao_23.repositories;

import com.akyama.sessao_23.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
