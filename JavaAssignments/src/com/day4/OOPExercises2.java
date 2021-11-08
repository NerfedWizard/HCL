package com.day4;

public class OOPExercises2 {

	static int a = 555;

	public static void main(String[] args) {
		A1 objA = new A1();
		B1 objB1 = new B1();
		A1 objB2 = new B1();
		C1 objC1 = new C1();
		B1 objC2 = new C1();
		A1 objC3 = new C1();
		objA.display();
		objB1.display();
		objB2.display();
		objC1.display();
		objC2.display();
		objC3.display();
	}

}
/**
 * Output for the above code:
 * a in A = 100
 * a in B = 123
 * a in B = 123
 * a in C = 543
 * a in C = 543
 * a in C = 543
 * 
 * */