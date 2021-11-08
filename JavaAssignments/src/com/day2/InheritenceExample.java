package com.day2;

public class InheritenceExample {

	public static void main(String[] args) {
		Bike M = new Bike();
	}

}

class Bike extends Cycle {
	String define_me() {
		return "a cycle with an engine.";
	}

	Bike() {
		Cycle cyc = new Cycle();
		System.out.println("Hello I am a motorcycle I am " + define_me());
		String temp = cyc.define_me();
		System.out.println("My ancestor is a cycle who is " + temp);
	}

}

class Cycle {
	String define_me() {
		return "a vehicle with pedals.";
	}

}
