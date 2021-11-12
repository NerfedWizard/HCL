package com.loel.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import lombok.*;

/**
 * Java 8 Assignment Due Monday 8th, 2021
 * Emp{id,name,age,gender,dept,yearofjoining,salary} Emp ->
 * 111,"Loel",24,Male,CS,2010,2021,123456
 * 
 * i) How many male and female employees are there? ii) Find out average age of
 * male and female employees? iii) Find the highest paid employee in this
 * employee class? iv) List all the names of employees who have joined after
 * 2016? v)Find out most senior employee in this emp class? vi) Count the number
 * of employees in each dept? vii) Find male and female employees are there in
 * the CS dept and Mechanical dept? viii) Find the average salary of male and
 * female employees? ix) Differentiate the employess who are younger or equal to
 * 30yrs from those employees who are older than 25 yrs? x)List down the names
 * of all employees in each dept?
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp1 {
	private String id;
	private String name;
	private int age;
	private String gender;
	private String dept;
	private int yoj;
	private double pay;

	public static void main(String[] args) {
		List<Emp1> empList = new ArrayList<Emp1>(createEmp());

		/** Finding the number of male/female employees */
		int numMales = (int) empList.stream().filter(str -> str.getGender().startsWith("M")).count();
		int numFemales = (int) empList.stream().filter(str -> str.getGender().startsWith("F")).count();
		System.out.println("Number of Male Employees: " + numMales);
		System.out.println("Number of Female Employees: " + numFemales);

		/** Finding the average age of male/female employees */
		int averageMaleAge = empList.stream().filter(str -> str.getGender() == "Male").mapToInt(a -> a.getAge()).sum()
				/ (int) (empList.stream().filter(str -> str.getGender() == "Male").count());
		System.out.println("Average age of Male Employees: " + averageMaleAge);
		int averageFemaleAge = empList.stream().filter(str -> str.getGender() == "Female").mapToInt(a -> a.getAge())
				.sum() / (int) (empList.stream().filter(str -> str.getGender() == "Female").count());
		System.out.println("Average age of Female Employees: " + averageFemaleAge);
	}

	/**
	 * Creating a list of Employees
	 * 
	 * @return List - employee list
	 */
	public static List<Emp1> createEmp() {
		List<Emp1> emplRecords = new ArrayList<Emp1>();
		emplRecords.add(new Emp1("0001", "Loel", 37, "Male", "Development", 2021, 60000));
		emplRecords.add(new Emp1("0003", "Ava", 25, "Female", "HR", 2007, 200000));
		emplRecords.add(new Emp1("0004", "Gary", 42, "Male", "HR", 2015, 10000));
		emplRecords.add(new Emp1("0005", "Veronica", 62, "Female", "Development", 2001, 650000));
		emplRecords.add(new Emp1("0006", "Fido", 18, "Female", "Development", 2019, 60000));
		emplRecords.add(new Emp1("0007", "Roger", 21, "Female", "The Boss", 2000, 1000254.88));
		return emplRecords;
	}
}
// For finding the youngest male
//Optional<Emp1> youngestMale = empList.stream()
//		.filter(str -> str.getGender() == "Male" && str.getDept() == "Development")
//		.min(Comparator.comparingInt(Emp1::getAge));
//
//System.out.println(youngestMale);