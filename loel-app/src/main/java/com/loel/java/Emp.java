package com.loel.java;

import com.loel.java8.Emp1;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
	private int empId;
	private String empName;

	public static void main(String[] args) {
		Emp e1 = new Emp(111, "Sara");
		Emp e2 = new Emp(112, "ABC");

		System.out.println(e1);
		System.out.println(e2);
		
		
	}
}
