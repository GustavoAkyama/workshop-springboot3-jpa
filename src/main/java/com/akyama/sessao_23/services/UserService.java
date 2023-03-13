package com.akyama.sessao_23.services;


import com.akyama.sessao_23.entities.User;
import com.akyama.sessao_23.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findbyId(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

 }