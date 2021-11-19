package com.loel;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.loel.model.Product;
import com.loel.service.ProductService;

/**
 * NewWay
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ProductService service = ctx.getBean(ProductService.class);
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

		/**
		 * Advantage loose coupling between the classes. ProductServie and ProductDAO
		 * are loosely coupled Maybe you can replace ProductDAO in another class so that
		 * there no code changes required in ProductService class
		 */
	}
}
