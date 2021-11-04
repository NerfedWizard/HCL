package com.loel.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//class Emp will become a POJO(Plain Old Java Object)
@Data // Annotation-> Metadata ->data about data
@NoArgsConstructor
@AllArgsConstructor
class Employee implements Cloneable { // Marker interface-> there is no abstract method
	private int empId;
	private String empName;

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class CloneableTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee(101, "Amy");
		Employee e2 = (Employee) e1.clone();

//		Employee 
		System.out.println(e1.getEmpId());

	}

}