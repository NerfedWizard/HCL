package com.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Addition {
	public static void main(String[] args) {
		Random rd = new Random();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int x = rd.nextInt(20);
			list.add(x);
		}
		addition(list);
	}
	public static void addition(List<Integer> i) {
		String str = i.get(0).toString();
		Integer sum = i.get(0);
		for (int n = 1; n < i.size(); n++) {
			sum += n;
			str += " + " + i.get(n).toString();
			String end = " = " + sum.toString();
			System.out.println(str + end);
		}
	}
}
