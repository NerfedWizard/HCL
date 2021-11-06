package com.day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Day3 {

	public static void main(String[] args) {
		// Q1 Testing
		String st = "This Is tHe String I am PUTTIng for THIs TEST";
		System.out.println(lowerCase(st));

		// Q2 Testing
		System.out.println(replace("Dog, Dolphin, Dand, Dot, Dut, Di"));

		// Q3 Testing
		Integer[] old = { 1, 4, 6, 9, 0, 6, 4, 3, 2, 5 };
		System.out.println(Arrays.toString(old));
		for (int i : sortAsc(old)) {
			System.out.println(i);
		}
		// Q4 Testing
		Random rd = new Random();
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			int x = rd.nextInt(25);
			nums[i] = x;
			System.out.println(x);
		}
		System.out.println(5 + " is in the list: " + foundInt(5, nums));

		// Q5 Testing
		String test5 = "HelloWorld";
		System.out.println(stringRange(1, 1, test5));
<<<<<<< HEAD

		// Q6
=======
		
		//Q6 Testing
>>>>>>> 88f1136cdc8fef8c2076771622da60ad5747a8a9
		String bob = "Bob";
		String racecar = "racecar";
		String helmet = "helmet";
		System.out.println(palindrome("bob"));

		// Q7
		String full = "The quick brown fox jumped over the lazy dogs back";
		String half = "This is my test sentence";
		pangram(full);

	}

	// Q7
	private static void pangram(String full) {
		String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		char[] check = full.toLowerCase().toCharArray();
		Arrays.sort(check);
		Set<String> checkD = new HashSet<>();
		String result = "This is a Pangram!!!!";
		for (int i = 0; i < check.length; i++) {
			Character temp = check[i];
			checkD.add(temp.toString());
		}
		for (String s : alpha) {
			if (!checkD.contains(s)) {
				result = "Not a Pangram";
			}
		}
		System.out.println(result);
	}

	// Q6
	public static boolean palindrome(String check) {
		char[] ch = check.toLowerCase().toCharArray();
		String revCheck = "";
		for (int i = check.length() - 1; i >= 0; i--) {
			revCheck += ch[i];
		}
		if (revCheck.equals(check.toLowerCase())) {
			return true;
		}
		return false;
	}

	// Q5
	private static String stringRange(int first, int last, String test5) {
		String result = "";
		char[] chr = test5.toCharArray();
		if (first > last) {
			int temp = first;
			first = last;
			last = temp;
		} else if (first == last) {
			last++;
		}
		if (last <= test5.length() - 1 || first > 0) {
			for (int i = first; i < last; i++) {
				result += chr[i];
			}
		} else {
			return "Index(es) out of bounds for string!!!!";
		}
		return result;
	}

	// Q4
	public static boolean foundInt(int searchD, int[] nums) {
		for (int i : nums) {
			if (i == searchD) {
				return true;
			}
		}
		return false;
	}

	// Q1
	private static String lowerCase(String st) {
		String s = "";
		char[] ch = st.toLowerCase().toCharArray();
		for (Character c : ch) {
			s += c;
		}
		return s;

	}

	// Q2
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

	// Q3
	public static Integer[] sortAsc(Integer[] old) {
		Arrays.sort(old);
		return old;
	}

}
