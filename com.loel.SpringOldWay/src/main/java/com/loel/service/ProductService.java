package com.loel.service;

import java.util.List;

import com.loel.dao.ProductDAO;
import com.loel.model.Product;

public class ProductService {
	/** insert dependency using a new keyword */
	ProductDAO p1 = new ProductDAO();// tight coupling

	public void addProduct(Product prd) {
		p1.addProduct(prd);

	}

	public List<Product> getProducts() {
		return p1.getAllProducts();

	}
}
