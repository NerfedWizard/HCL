package com.loel.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		boolean b3 = Pattern.matches(".s", "as");
		
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println(Pattern.matches(".s", "mk"));
		System.out.println(Pattern.matches(".s", "mst"));
		System.out.println(Pattern.matches(".s", "amms"));
		System.out.println(Pattern.matches("..s", "mas"));
		
		System.out.println(Pattern.matches("[amn]", "abcd"));
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]", "ammmna"));
		
		System.out.println(Pattern.matches("[amn]?", "a"));
		System.out.println(Pattern.matches("[amn]?", "aaa"));
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "diva$4"));

	}

}
