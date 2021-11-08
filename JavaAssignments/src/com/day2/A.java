package com.day2;

public class A {
	String square = "square";
	String rectangle = "rectangle";

	void shape() {
		System.out.println("Quadrilateral");
	}
}

class B extends A {
	String shape = "trapezoid";

	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.rectangle);
		System.out.println(obj.square);
		System.out.println(obj.shape);
		obj.shape();
	}
}
