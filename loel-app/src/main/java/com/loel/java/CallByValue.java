package com.loel.java;

class Calculate {
	int data = 23;

	void update(int data) {
		data = data + 12;
	}

	void update2(Calculate c) {
		c.data = c.data + 12;
	}
}

public class CallByValue {
	public static void main(String[] args) {
		Calculate c1 = new Calculate();
		System.out.println("b4 update " + c1.data);
		c1.update(25);
		System.out.println("after update " + c1.data);

		Calculate c2 = new Calculate();
		System.out.println("b4 update " + c2.data);
		c1.update2(c2);
		System.out.println("after update " + c2.data);
	}
}
