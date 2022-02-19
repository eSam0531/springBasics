package com.esmee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esmee.model.Product;
import com.esmee.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAllProduct() {
		return repo.findAll();
	}
	
	public void createProduct(Product prd) {
		repo.save(prd);
	}
	
	public Optional<Product> getProductsById(Integer id) {
		return repo.findById(id);
	}
	
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
	}
	
	//do update product on our own
	public void update(Product prd) {
		repo.save(prd);
	}
}
