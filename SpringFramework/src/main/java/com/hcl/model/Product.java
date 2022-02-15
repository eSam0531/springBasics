package com.hcl.model;

import lombok.Data;

@Data
public class Product {

	private String prdName;
	private String prdPrice;

	public void getProductDetails() {
		System.out.println("The product name is " + prdName + ". The product price is " + prdPrice + ".");
	}
}
