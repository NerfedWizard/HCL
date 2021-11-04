package com.loel.java;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer ss = new StringTokenizer("Welcome to the world of java!!!!!");
		while (ss.hasMoreTokens()) {
			System.out.println(ss.nextToken());
		}
	}

}
