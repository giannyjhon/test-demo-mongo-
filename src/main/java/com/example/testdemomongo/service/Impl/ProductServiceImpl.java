package com.example.testdemomongo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.testdemomongo.commons.GenericServiceImpl;
import com.example.testdemomongo.dao.api.ProductsRepository;
import com.example.testdemomongo.model.Produts;
import com.example.testdemomongo.service.api.ProductServiceAPI;

@Service
public class ProductServiceImpl extends GenericServiceImpl<Produts, Long> implements ProductServiceAPI{
	
	@Autowired
	private ProductsRepository productsRepository;

	@Override
	public CrudRepository<Produts, Long> getDao() {
		
		return productsRepository;
	}

}
