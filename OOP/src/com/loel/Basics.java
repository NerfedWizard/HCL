/**
 * 
 */
package com.loel;

/**
 * @author loeln
 *
 */
public class Basics {
	int id; // instance variable
	String name;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Basics b = new Basics();
		Basics b2 = new Basics();
		b.insert(45, "Shashank");
		b.print();
		b.id = 13;
		b.name = "nelson";
		b2.id = 23;
		b2.name = "Mani";
		System.out.println("Welcome " + b.id + " " + b.name);
		System.out.println("Welcome " + b2.id + " " + b2.name);
	}

	void insert(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void print() {
		System.out.println(id + " " + name);
	}

}
