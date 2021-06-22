package com.example.testdemomongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testdemomongo.model.Order;
import com.example.testdemomongo.service.api.OrderServiceAPI;

@RestController
@RequestMapping("/api/order")
@CrossOrigin("*")
public class OrderController {
	
 @Autowired
 private OrderServiceAPI orderServiceAPI;
 
 @GetMapping(value = "/all")
 public List<Order> getAll(){
	 return orderServiceAPI.getAll();
 }
 
 @GetMapping(value = "/find/{id}")
 public ResponseEntity<Order> find(@PathVariable Long id){
	 Order orden = orderServiceAPI.get(id);
	 if( orden != null) {
		 return new ResponseEntity<Order>(orden, HttpStatus.OK);
	 }else {
		
		 return new ResponseEntity<Order>(HttpStatus.NO_CONTENT);
	 }
	 
 }

 @PostMapping(value = "/save")
 public ResponseEntity<Order> save(@RequestBody Order orden){
	 Order obj = orderServiceAPI.save(orden);
	return new ResponseEntity<Order>(obj, HttpStatus.OK);
 }
 
 @DeleteMapping("/delete/{id}")
 public ResponseEntity<Order> delete(@PathVariable Long id){
	 Order orden = orderServiceAPI.get(id);
	 if( orden != null) {
		 orderServiceAPI.delete(id);
	 }else {
		
		 return new ResponseEntity<Order>(HttpStatus.NO_CONTENT);
	 }
	 
	 return new ResponseEntity<Order>(orden, HttpStatus.OK);
 }

}
