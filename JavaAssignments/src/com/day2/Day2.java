package com.day2;

public class Day2 {

	public static void main(String[] args) {
		System.out.println(smallestNumber(6, 9, 0));
		System.out.println(middleChar("12"));
	}
//Q1
	public static int smallestNumber(int x, int y, int z) {
		int min = y;
		if (y > x) {
			min = x;
		}
		if (z < x) {
			min = z;
		}
		return min;
	}
//Q2
	public static String middleChar(String find) {
		char[] str = find.toCharArray();
		String middle = "";
		int index = str.length / 2;
		if (str.length % 2 == 0) {
			middle = Character.toString(str[index - 1]) + Character.toString(str[index]);
		} else {
			middle = Character.toString(str[index]);
		}
		return middle;
	}
//Q3
	public static void countVowels(String str) {
		char[] st = str.toLowerCase().toCharArray();
		char[] vls = { 'a', 'e', 'i', 'o', 'u' };
		int count = 0;
		for (Character c : st) {
			for (Character v : vls) {
				if (c == v) {
					count++;
				}
			}
		}
		System.out.println("Number of Vowels in the string: " + count);
	}
}
