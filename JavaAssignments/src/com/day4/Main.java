package com.day4;

public class Main {

	public static void main(String[] args) {
		Shape circle = new Circle("Circle", 5);
		Shape square = new Square("Square", 8);
		Shape rectangle = new Rectangle("Rectangle", 3, 2);

		circle.setName("Circle");
		rectangle.setName("Rectangle");
		square.setName("Rectangle");
		System.out.println(circle.getName() + " " + circle.calculateArea());
		System.out.println(square.getName() + " " + square.calculateArea());
		System.out.println(rectangle.getName() + " " + rectangle.calculateArea());
	}

}
