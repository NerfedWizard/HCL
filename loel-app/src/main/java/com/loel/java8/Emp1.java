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
//	static int counter = 0;

	public static void main(String[] args) {
		List<Emp1> empList = new ArrayList<Emp1>(createEmp());
		// For finding the youngest male
		Optional<Emp1> youngestMale = empList.stream()
				.filter(str -> str.getGender() == "Male" && str.getDept() == "Development")
				.min(Comparator.comparingInt(Emp1::getAge));

		System.out.println(youngestMale);
		/** Using this to get the average age of the genders in the company */
//		average(Predicate<Emp1> gndrList = empList.stream().filter(str -> str.getGender() == "Female");
		// Find the number of male and female employees
//		Optional<Emp1> numberOfEmp = createEmp().stream().filter(str -> str.getGender() == "Male" && )
	}

//		List<String> genX = new ArrayList<String>();
//		List<Integer> agesM = new ArrayList<Integer>();
//		List<Integer> agesF = new ArrayList<Integer>();
//		int mAge = 0;
//		int fAge = 0;
//		for (Emp1 e : createEmp()) {
//			genX.add(e.getGender());
//			if (e.getGender().equals("Male")) {
//				agesM.add(e.getAge());
//			} else {
//				agesF.add(e.getAge());
//			}
//		}
//		for (Integer i : agesM) {
//			mAge += i;
//		}
//
//		for (Integer i : agesF) {
//			fAge += i;
//		}
	/**
	 * Look at geeks for geeks and use the predicate and functional programming from
	 * java 8
	 */
// i) How many male and female employees are there?
//		Predicate<String> g = str -> str.startsWith("M");
//		Predicate<String> w = str -> str.startsWith("F");
//		Integer m = (int) genX.stream().filter(g).count();
//		Integer f = (int) genX.stream().filter(w).count();
//		System.out.println("Total employees: " + genX.stream().count() + "\nTotal identify male: " + m
//				+ "\nTotal indentify female: " + f);
//		
// ii) Find out average age of male and female employees?
//	Change this to use the System.out::println
//		System.out.println("Average age of males: " + (mAge / m));
//		System.out.println("Average age of females: " + (fAge / f));

// iii) Find the highest paid employee in this* employee class?

	// Example to optimize it
//		List<Emp1> list = new ArrayList<>();
//		list.add(new Emp1("0001", "Loel", 37, "Male", "Development", 2021, 60000));
//		Optional<Emp1> youngestMale = createEmp().stream()
//				.filter(str -> str.getGender() == "Male" && str.getDept() == "Development")
//				.min(Comparator.comparingInt(Emp1::getAge));
//
//		System.out.println(youngestMale);
//	}

// i)
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

	public static int average(List<Emp1> list) {
		int totalAge = 0;
		int averageAge = 0;
//		for() {
//			
//		}
		return averageAge;
	}
}