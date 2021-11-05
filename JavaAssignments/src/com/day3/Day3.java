package com.day3;

import java.util.Arrays;
import java.util.Random;

public class Day3 {

	public static void main(String[] args) {
		// Q1
		String st = "This Is tHe String I am PUTTIng for THIs TEST";
		System.out.println(lowerCase(st));

		// Q2
		System.out.println(replace("Dog, Dolphin, Dand, Dot, Dut, Di"));

		// Q3
		Integer[] old = { 1, 4, 6, 9, 0, 6, 4, 3, 2, 5 };
		System.out.println(Arrays.toString(old));
		for (int i : sortAsc(old)) {
			System.out.println(i);
		}
		// Q4
		Random rd = new Random();
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			int x = rd.nextInt(25);
			nums[i] = x;
			System.out.println(x);
		}
		System.out.println(5 + " is in the list: " + foundInt(5, nums));
	}
	
/**Question 4*/
	public static boolean foundInt(int searchD, int[] nums) {
		for (int i : nums) {
			if (i == searchD) {
				return true;
			}
		}
		return false;
	}

	// D3Q1
	private static String lowerCase(String st) {
		String s = "";
		char[] ch = st.toLowerCase().toCharArray();
		for (Character c : ch) {
			s += c;
		}
		return s;

	}

	public static String replace(String old) {
		String chng = "";
		char[] ch = old.toLowerCase().toCharArray();
		for (Character c : ch) {
			if (c.equals('d')) {
				c = 'h';
			}
			chng += c;
		}

		return chng;
	}

	public static Integer[] sortAsc(Integer[] old) {
		Arrays.sort(old);
		return old;
	}

}
