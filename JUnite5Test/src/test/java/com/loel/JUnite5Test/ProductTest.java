package com.loel.JUnite5Test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
	@Test
	public void productTest() {
//		fail("make test case fail");
		Product p1 = new Product();

		Assertions.assertEquals(143, p1.multiply(12, 12));
	}
}
