package com.esmee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esmee.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
