package com.loel.springFramework2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Example of not using .xml file but using the ApplicationContext
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ProductConfig.class);
		Product p1 = (Product) ctx.getBean("configBean");
		p1.setPrdId(111);
		p1.setPrdName("Chair");
		p1.setPrdPrice(123);
		p1.print();
	}
}
