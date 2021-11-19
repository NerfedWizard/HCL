package com.loel.com.loel.springFramework;

import java.util.List;

import com.loel.model.Product;
import com.loel.service.ProductService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ProductService service = new ProductService();
		Product p1 = new Product(100, "hardisk", 24);
		Product p2 = new Product(101, "mouse", 23);
		Product p3 = new Product(102, "keyboard", 20);
		Product p4 = new Product(103, "Monitor", 234);
		Product p5 = new Product(104, "laptop", 1234);

		service.addProduct(p1);
		service.addProduct(p2);
		service.addProduct(p3);
		service.addProduct(p4);
		service.addProduct(p5);

		List<Product> prds = service.getProducts();
		prds.forEach(System.out::println);

		/**The main disadvantage is tight coupling 
		 * ProductService and ProductDAO are tightly coupled
		 * If ProductDAO is supposed replaced by another class in future
		 * then there will be code changes required for ProductService class 
		 * Testing will become cumbersome and also its different  */
	}
}
