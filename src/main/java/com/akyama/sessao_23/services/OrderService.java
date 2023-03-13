package com.akyama.sessao_23.services;


import com.akyama.sessao_23.entities.Order;
import com.akyama.sessao_23.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findbyId(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }

 }
