package com.loel.JUnite5Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@BeforeAll
	static void setUp() {
		System.out.println("@B4All executed");
	}

	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
//        assertTrue( true );
	}

	@BeforeEach
	void setUpThis() {
		System.out.println("@B4Each executed");
	}

	@Tag("PROD")
	@Test
	void printProdTest() {
		System.out.println("PrintProdTest executed");
	}

	@Tag("QA")
	@Test
	@Disabled
	void printQATest() {
		System.out.println("PrintQATest executed");
	}

	@Tag("Dev")
	@Test
	void printDevTest() {
		System.out.println("PrintDevTest executed");
	}

	@Test
	void calculateTest() {
		System.out.println("Calculate Test executed");
		Assertions.assertEquals(6, Calculator.add(3, 3));
	}

	@AfterAll
	static void tearDown() {
		System.out.println("@AfterAll Static Executed");
	}

	@AfterEach
	void testThis() {
		System.out.println("AfterEach executed");
	}
}
