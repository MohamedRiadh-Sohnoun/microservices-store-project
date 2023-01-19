package com.hannibal.productservice.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.hannibal.productservice.model.Product;;

public interface ProductRepository extends MongoRepository<Product, String>{
    
}
