package com.day1;

public class A {
	int a = 100;

	public void display() {
		System.out.printf("a in A = %d\n", a);
	}

}

class B extends A {
	private int a = 123;

	public void display() {
		System.out.printf("a in B = %d\n", a);
	}

}

class C extends B {
	private int a = 543;

	public void display() {
		System.out.printf("a in C = %d\n", a);
	}

}
