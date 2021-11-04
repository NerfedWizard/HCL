package com.loel.java;
/**Wrapper class - normally Collections doesn't support primitive data types
 * int, short, long, char, boolean
 * represent primitive type as an Object then you have to go forWrapper classes*/
public class WrapperClassTest {

	public static void main(String[] args) {
		int i = 12;
		Integer x = new Integer(12);
		Integer i2 = Integer.valueOf(i);
		Integer i3 = i;

	}

}
