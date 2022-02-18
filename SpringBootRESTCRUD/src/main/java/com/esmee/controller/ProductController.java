package com.esmee.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.esmee.model.Product;
import com.esmee.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public List<Product> listAll(){
		return service.listAllProduct();
	}
	
	@GetMapping("/products/{id}")
	public Optional<Product> getPrdById(@PathVariable Integer id){
		try {
			Optional<Product> prd = service.getProductsById(id);
			return prd; //200
		}catch (NoSuchElementException e) {
			return null; //404
		}
	}
	
	@PostMapping("/products")
	public void addProdcut(@RequestBody Product prd) {
		service.createProduct(prd);
	}
	
	@DeleteMapping("/products{id}")
	public void deleteProdcut(@PathVariable Integer id) {
		service.deleteProduct(id);
	}
	
	//update method create on our own
}
