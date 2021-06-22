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


import com.example.testdemomongo.model.Produts;
import com.example.testdemomongo.service.api.ProductServiceAPI;

@RestController
@RequestMapping("/api/product")
@CrossOrigin("*")
public class ProductController {
	
	@Autowired
	 private ProductServiceAPI productServiceAPI;
	 
	 @GetMapping(value = "/all")
	 public List<Produts> getAll(){
		 return productServiceAPI.getAll();
	 }
	 
	 @GetMapping(value = "/find/{id}")
	 public ResponseEntity<Produts> find(@PathVariable Long id){
		 Produts producto = productServiceAPI.get(id);
		 if( producto != null) {
			 return new ResponseEntity<Produts>(producto, HttpStatus.OK);
		 }else {
			
			 return new ResponseEntity<Produts>(HttpStatus.NO_CONTENT);
		 }
		 
	 }

	 @PostMapping(value = "/save")
	 public ResponseEntity<Produts> save(@RequestBody Produts producto){
		 Produts obj = productServiceAPI.save(producto);
		return new ResponseEntity<Produts>(obj, HttpStatus.OK);
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public ResponseEntity<Produts> delete(@PathVariable Long id){
		 Produts producto = productServiceAPI.get(id);
		 if( producto != null) {
			 productServiceAPI.delete(id);
		 }else {
			
			 return new ResponseEntity<Produts>(HttpStatus.NO_CONTENT);
		 }
		 
		 return new ResponseEntity<Produts>(producto, HttpStatus.OK);
	 }

}
