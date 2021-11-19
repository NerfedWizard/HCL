package com.loel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private int prdId;
	private String prdName;
	private int prdPrice;

	void print() {
		System.out.println("Product id: " + prdId + " Product Name: " + prdName + " Product price: " + prdPrice);
	}
}
