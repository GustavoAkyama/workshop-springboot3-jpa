package com.akyama.sessao_23.repositories;

import com.akyama.sessao_23.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
