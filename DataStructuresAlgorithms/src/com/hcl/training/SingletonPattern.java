package com.hcl.training;

public class SingletonPattern {
	// EAGER INSTANTIATION
	// create an object of SingleObject
	private static SingletonPattern instance = new SingletonPattern(); // class or static member
	// Lazy instantiation
	private static SingletonPattern instance2;

	// make the constructor private so that this class cannot be
	// instantiated
	private SingletonPattern() {
	}

	// Get the only object available
	public static SingletonPattern getInstance() {
		// Lazy instantiation
		// synchronized can be use in two way :1) method 2) as a block
		if (instance2 == null) {
			synchronized (SingletonPattern.class) {
				if (instance2 == null) {
					instance2 = new SingletonPattern(); // instance will be created only at request time
				}
			}
		}
		return instance;
	}

	public static SingletonPattern getConnection() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Welcome to the world of singleton");
	}
}

class Test2 {

	public static void main(String[] args) {
		SingletonPattern s = SingletonPattern.getConnection();
		s.showMessage();
		SingletonPattern s1 = SingletonPattern.getConnection();
		s1.showMessage();
		SingletonPattern s2 = SingletonPattern.getConnection();
		s2.showMessage();

	}
}
