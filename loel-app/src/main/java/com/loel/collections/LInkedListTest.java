package com.loel.collections;
import java.util.*;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;

public class LInkedListTest {

	public static void main(String[] args) {
		List<String> list2 = new ArrayList<>();
		LinkedList<String> list = new LinkedList<>();
		list.add("Sashank");
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ravi");
		list.add("Ajay");

		list.remove("Ajay");
		list.remove(0);

		list.forEach(System.out::println);
		Collections.sort(list);
		Iterator<String> itr = list.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
