package com.loel.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.*;

/**
 * Java 8 Assignment 
 * Emp{id,name,age,gender,dept,yearofjoining,salary} Emp -> 111,"Loel",24,Male,CS,2010,2021,123456
 * 
 * i) How many male and female employees are there? 
 * ii) Find out average age of male and female employees? 
 * iii) Find the highest paid employee in this employee class? 
 * iv) List all the names of employees who have joined after 2016? 
 * v)Find out most senior employee in this emp class? 
 * vi) Count the number of employees in each dept? 
 * vii) Find male and female employees are there in the CS dept and Mechanical dept?
 * viii) Find the average salary of male and female employees?
 * ix) Differentiate the employees who are younger or equal to 30yrs from those
 * employees who are older than 25 yrs? 
 * x)List down the names of all employees in each dept?
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
	private int yearOfJoining;
	private int salary;

	public static void main(String[] args) {
		List<Emp1> empList = new ArrayList<Emp1>(createEmp());

		/**
		 * Finding the number of male/female employees
		 */
		int numMales = (int) empList.stream().filter(str -> str.getGender().startsWith("M")).count();
		int numFemales = (int) empList.stream().filter(str -> str.getGender().startsWith("F")).count();
		System.out.println("Number of Male Employees: " + numMales);
		System.out.println("Number of Female Employees: " + numFemales + "\n");

		/**
		 * Finding the average age of male/female employees
		 */
		int averageMaleAge = empList.stream().filter(str -> str.getGender() == "Male").mapToInt(a -> a.getAge()).sum()
				/ (int) (empList.stream().filter(str -> str.getGender() == "Male").count());
		System.out.println("Average age of Male Employees: " + averageMaleAge);
		int averageFemaleAge = empList.stream().filter(str -> str.getGender() == "Female").mapToInt(a -> a.getAge())
				.sum() / (int) (empList.stream().filter(str -> str.getGender() == "Female").count());
		System.out.println("Average age of Female Employees: " + averageFemaleAge + "\n");

		/**
		 * Gets the highest paid employees salary
		 */
		System.out.println(
				"The top paid employee: \n" + empList.stream().max(Comparator.comparing(Emp1::getSalary)) + "\n");

		/**
		 * List of employees who joined after 2016
		 */
		Consumer<Emp1> printJunior = j -> System.out.println("Joined After 2016: \n" + j + "\n");
		Stream<Emp1> juniorEmp = empList.stream().filter(str -> str.getYearOfJoining() > 2016);
		juniorEmp.forEach(printJunior);
		System.out.println();

		/**
		 * Most senior employee
		 */
		System.out.println(
				"Most Senior Employee: \n" + empList.stream().min(Comparator.comparing(Emp1::getYearOfJoining)));
		System.out.println();

		/**
		 * Number of employees in each department
		 */
		for (Map.Entry<String, Long> entry : empList.stream()
				.collect(Collectors.groupingBy(Emp1::getDept, Collectors.counting())).entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		/**
		 * Find average salary of male/female
		 */
		int f = 0;
		int m = 0;
		int i = 0;
		for (Map.Entry<String, Map<Integer, List<Emp1>>> entry : empList.stream()
				.collect(Collectors.groupingBy(Emp1::getGender, Collectors.groupingBy(Emp1::getSalary))).entrySet()) {
			if (entry.getKey().equals("Female")) {
				for (Map.Entry<Integer, List<Emp1>> ent : entry.getValue().entrySet()) {
					f += ent.getKey();
					i++;
				}
			} else {
				for (Map.Entry<Integer, List<Emp1>> ent : entry.getValue().entrySet()) {
					m += ent.getKey();
				}
			}
		}
		System.out.println("\nAverage Female salary: " + f / i);
		i = empList.size() - i;
		System.out.println("Average Male salary: " + m / i + "\n");

		/**
		 * Separate the employees into two groups 30>= x > 0, 30 < n
		 */
		Object[] young = empList.stream().filter(str -> str.getAge() <= 30).toArray();
		Object[] old = empList.stream().filter(s -> s.getAge() > 30).toArray();

		for (int x = 0; x < young.length; x++) {
			System.out.println(((Emp1) young[x]).getName() + " is " + ((Emp1) young[x]).getAge());
		}
		System.out.println();
		for (int x = 0; x < young.length; x++) {
			System.out.println(((Emp1) old[x]).getName() + " is " + ((Emp1) old[x]).getAge());
		}
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
		emplRecords.add(new Emp1("0007", "Jones", 21, "Female", "The Boss", 2000, 1000254));
		emplRecords.add(new Emp1("0008", "Mike", 34, "Male", "Development", 2021, 65000));
		emplRecords.add(new Emp1("0009", "Danni", 26, "Female", "HR", 2007, 175000));
		emplRecords.add(new Emp1("0010", "Fredick", 51, "Male", "HR", 2015, 22000));
		emplRecords.add(new Emp1("0011", "Erin", 68, "Female", "Development", 2001, 47500));
		emplRecords.add(new Emp1("0012", "Dorthy", 43, "Female", "Development", 2019, 35600));
		emplRecords.add(new Emp1("0013", "Mia", 27, "Female", "Vice President", 2000, 185246));
		return emplRecords;
	}
}