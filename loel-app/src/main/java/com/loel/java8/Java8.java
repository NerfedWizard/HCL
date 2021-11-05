package com.loel.java8;

@FunctionalInterface
interface Car {
	abstract void speed(String s1);
}

public class Java8 {

	public static void main(String[] args) {
		// Approach 1
		Car car = c1 -> {
			System.out.println(c1);
		};
		car.speed("100 mph");

		// Approach 2
		Car car1 = c1 -> System.out.println(c1);
		car1.speed("500 mph");

		// Approach3
		Car car2 = new Car() {
			public void speed(String s) {
				System.out.println(s);
			};

		};
		car2.speed("300 mph");
	}
}