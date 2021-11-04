package com.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Day1Java {
//	private static int total = 0;

	public static void main(String[] args) {

//		  Problem 1: 
		System.out.println("-5 + 8 * 6 = " + -5 + 8 * 6);
		System.out.println("(55+9) % 9 = " + (55 + 9) % 9);
		System.out.println("20 + -3*5 / 8 = " + 20 + -3 * 5 / 8);
		int x = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + x);

//		  Problem 2: 
		int y = 20 + 4;
		System.out.println("20 + 4 = " + y);
		int x111 = 20 - 4;
		System.out.println("20 - 4 = " + x111);
		System.out.println("20 * 4 = " + 20 * 4);
		System.out.println("20 / 4 = " + 20 / 4);
		System.out.println("20 % 4 = " + 20 % 4);

//		 Problem 3:
		int total = 0;
		Scanner sc = new Scanner(System.in);
		int x1 = 0;
		System.out.println("What is the input? ");
		int count = 0;
		do {
			x1 += sc.nextInt();
			count++;
		} while (count < 3);
		total = x1 / count;
		System.out.println("The Average of the inputs is: " + total);

		// Problem 4:
		int x11 = 3;
		int y1 = 5;
		swap(x11, y1);
		int i = 1;
		// 5
		System.out.println("Is 3 prime? " + primeNumber(x11));
		System.out.println("Is 21 prime? " + primeNumber(21));
		System.out.println("31 " + primeNumber(31));
		System.out.println("43 " + primeNumber(43));
		System.out.println("51 " + primeNumber(51));
		System.out.println("109 " + primeNumber(109));
		System.out.println("110 " + primeNumber(110));
		System.out.println("111 " + primeNumber(111));
		System.out.println("223 " + primeNumber(223));
		System.out.println("Enter the character: ");
		Scanner s1 = new Scanner(System.in);
		String s = s1.next();
		char c = s.charAt(0);

		System.out.println(valueOfChar(c));
		countVowels("HCL AEIoUTechnologies");
		fizzBuzz();
		String st = "";
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter an Sentence: ");
		st = s3.nextLine();
		System.out.println(getLargestWord(st));
		System.out.println(smallestNumber(6, 9, 0));
		System.out.println(middleChar("12"));

	}

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

	public static String getLargestWord(String sen) {
		String[] str = sen.split(" ");
		int max = 0;
		String longest = "";
		for (String s : str) {
			System.out.println(s);
			int min = s.length();
			if (min > max) {
				max = min;
				longest = s;
			}
		}
		return longest;
	}

	private static int sumOfSquaresOfEvenDigits(int pos2) {
		String chr = Integer.toString(pos2);
		char[] ch = chr.toCharArray();
		int sum = 0;
		for (char c : ch) {
			if ((int) c % 2 == 0) {
				sum += Math.pow(((int) c - 48), 2);
			}
		}
		return sum;

	}

//problem 10
	private static int checkSum(int pos) {
		String chr = Integer.toString(pos);
		char[] ch = chr.toCharArray();
		int x = 0;
		for (int i = 0; i < ch.length - 1; i++) {
			if ((int) ch[i] % 2 != 0) {
				x = x + (int) ch[i];
			}
		}
		if (x % 2 == 0) {
			x = -1;
		} else {
			x = 1;
		}
		return x;
	}

	private static void fizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i + "Buzz");
				if (i % 3 == 0) {
					System.out.println(i + "Fizz Buzz");
				}
			} else if (i % 3 == 0) {
				System.out.println(i + "Fizz");
			} else {
				System.out.println(i);
			}
		}
	}

	private static int valueOfChar(char c) {
		return (int) c;

	}

	private static boolean primeNumber(int x) {
		int check1 = 3;
		if (x == check1) {
			return true;
		}
		int check2 = 2;
		if (x == check2) {
			return true;
		}
		if (x % check1 != 0 && x % check2 != 0) {
			return true;
		}
		return false;
	}

	private static void swap(int x, int y) {
		System.out.println("x = " + x + " y = " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x + " y = " + y);

	}

	public static void printAverage(int count, int num) {

	}

}
