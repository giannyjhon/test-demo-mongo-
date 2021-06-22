package com.example.testdemomongo.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.testdemomongo.model.Order;

public interface OrderRepository extends MongoRepository<Order, Long>{

	
}
