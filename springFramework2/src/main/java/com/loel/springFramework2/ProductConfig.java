package com.loel.springFramework2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {
	@Bean(name = "configBean")
	public Product getProducts() {
		return new Product();
	}

}
