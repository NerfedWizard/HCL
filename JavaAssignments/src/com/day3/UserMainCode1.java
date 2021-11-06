package com.day3;

/**
 * Question 9 Take a string and reverse it and place a char in between each
 * character
 */
public class UserMainCode1 {
	public static void main(String[] args) {
		char a = '+';
		String rabbit = "rabbit";
		System.out.println(reverseAddChar(rabbit, a));
	}

	public static String reverseAddChar(String old, char sep) {
		String result = "";
		char[] chngd = old.toLowerCase().toCharArray();
		for (int i = chngd.length - 1; i >= 0; i--) {
			result += chngd[i];
			if (i != 0) {
				result += sep;
			}
		}
		return result;
	}
}
