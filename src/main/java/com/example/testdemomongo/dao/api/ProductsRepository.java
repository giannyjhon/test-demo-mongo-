package com.example.testdemomongo.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.testdemomongo.model.Produts;

public interface ProductsRepository extends MongoRepository<Produts, Long>{

}
