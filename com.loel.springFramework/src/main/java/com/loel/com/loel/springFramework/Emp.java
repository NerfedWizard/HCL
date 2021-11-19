package com.loel.com.loel.springFramework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
	private int empId;
	private String empName;
	private Address addr;

	void printEmp() {
		System.out.println("Emp ID " + empId + "\nName " + empName + "\nAddress " + addr);
	}
}
