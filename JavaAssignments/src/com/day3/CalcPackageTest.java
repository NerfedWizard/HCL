package com.day3;

import com.hcl.Calculator;

/** Tester method for using calc method from another package 
 * 
 * Q9D3*/
public class CalcPackageTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(2, 3));
	}

}
