package com.loel.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Behar");
		list.add("Creigh");
		list.add("Michael");
		list.add("Sam");

		System.out.println(list);
		System.out.println("__________________________________________________________");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("__________________________________________________________");
		for (String name : list) {
			System.out.println(name);

		}
		list.set(1, "Loel");
		System.out.println("__________________________________________________________");
		for (String name : list) {
			System.out.println(name);

		}
	}

}
