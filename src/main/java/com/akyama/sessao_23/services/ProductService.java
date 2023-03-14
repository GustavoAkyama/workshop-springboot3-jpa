package com.akyama.sessao_23.services;



import com.akyama.sessao_23.entities.Product;
import com.akyama.sessao_23.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findbyId(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

 }
