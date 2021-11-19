package com.loel.dao;

import java.util.ArrayList;
import java.util.List;

import com.loel.model.Product;

public class ProductDAO {
	private List<Product> prds = new ArrayList<>();

	public void addProduct(Product product) {
		prds.add(product);
	}

	public List<Product> getAllProducts() {
		return new ArrayList<Product>(prds);
	}
}
