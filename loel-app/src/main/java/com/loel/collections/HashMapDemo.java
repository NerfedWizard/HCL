package com.loel.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		int a = 12;
		int b = 3;
		int c = 23;

		Map<String, Integer> map = new HashMap<>();
		map.put("a", 12);
		map.put("b", 3);
		map.put("c", 23);

		System.out.println(map);
		System.out.println(map.get("b"));

		Map<String, String> pwd = new HashMap<>();
		pwd.put("alex", "123");
		pwd.put("mani", "345");
		pwd.put("behar", "456");

		System.out.println(pwd);
		System.out.println(pwd.get("behar"));
		System.out.println(pwd.containsValue("456"));
		System.out.println(pwd.size());
		System.out.println(pwd.replace("mani", "444"));
		System.out.println(pwd);
		
		

	}
	
}
