package com.example.testdemomongo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.testdemomongo.commons.GenericServiceImpl;
import com.example.testdemomongo.dao.api.OrderRepository;
import com.example.testdemomongo.model.Order;
import com.example.testdemomongo.service.api.OrderServiceAPI;


@Service
public class OrderServiceImpl extends GenericServiceImpl<Order, Long> implements OrderServiceAPI{
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public CrudRepository<Order, Long> getDao() {
		
		return orderRepository;
	}

}
