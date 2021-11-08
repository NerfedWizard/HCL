package com.loel.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Method Reference help to point to methods by their names. :: -> method
 * reference It can be applied to static, instance methods, and constructor as
 * well
 */
interface Print {
	void test();
}

public class MethodReference {
	public static void printDisplay() {
		System.out.println("static method is called");
	}

	public static void main(String[] args) {
		Print print = MethodReference::printDisplay;
		print.test();

		;
		List<String> list = new ArrayList<>();
		list.add("loel");
		list.add("Divanshu");
		list.add("Saran");

		list.forEach(System.out::println);

	}

}
