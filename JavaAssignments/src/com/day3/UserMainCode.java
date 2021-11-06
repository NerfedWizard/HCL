package com.day3;

public class UserMainCode {

	public static void main(String[] args) {
		String erin = "poop";
		String honey = "Honey";
		String khan = "khan";
		String kitchen = "kitchen";
		System.out.println(getString(kitchen));
	}

	public static String getString(String old) {
		char[] ch = old.toLowerCase().toCharArray();
		String chngd = "";
		for (int i = 0; i < ch.length; i++) {
			if (i <= 1 && (ch[i] == 'h' || ch[i] == 'k')) {
				chngd += ch[i];
			} else if (i > 1) {
				chngd += ch[i];
			}

		}
		return chngd;
	}

}
