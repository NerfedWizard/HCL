package com.loel.java;

import lombok.*;
/**To make a user define class as immutable we need to follow the steps 
 * i) class must be final (we cannot sub class it)
 * ii)*/
@AllArgsConstructor
@Getter
public class Product {
	final String productName;
}

class Test {
	public static void main(String[] args) {
		Product p1 = new Product("Laptop");
		String p2 = p1.getProductName();
		System.out.println("Product name is " + p2);
	}
}