package com.akyama.sessao_23.repositories;

import com.akyama.sessao_23.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
