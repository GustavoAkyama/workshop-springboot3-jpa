package com.akyama.sessao_23.services;


import com.akyama.sessao_23.entities.OrderItem;
import com.akyama.sessao_23.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository repository;

    public List<OrderItem> findAll(){
        return repository.findAll();
    }

    public OrderItem findbyId(Long id){
        Optional<OrderItem> obj = repository.findById(id);
        return obj.get();
    }

 }
