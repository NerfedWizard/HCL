package com.loel.service;

import java.util.List;

import com.loel.dao.ProductDAO;
import com.loel.model.Product;

public class ProductService {
	
	ProductDAO p1;// loose coupling -> Has A -> Aggregation

	public void addProduct(Product prd) {
		p1.addProduct(prd);

	}

	public List<Product> getProducts() {
		return p1.getAllProducts();

	}

	// Setter for ProductDAO (setter injection)
	public void setP1(ProductDAO p1) {
		this.p1 = p1;
	}
}
