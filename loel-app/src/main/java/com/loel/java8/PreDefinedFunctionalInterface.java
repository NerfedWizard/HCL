package com.loel.java8;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class PreDefinedFunctionalInterface {

	/*
	 * Consumer(pre defined functional interface) accepts method a single input and
	 * return no output
	 *
	 */
	public static void main(String[] args) {
		Consumer<String> printConsumer = t -> System.out.println(t);
		Stream<String> cities = Stream.of("USA", "India", "China", "Australia");
		cities.forEach(printConsumer);

		List<String> cities1 = Arrays.asList("USA", "India", "China", "Australia");
// converts a list of items into upper case strings
		Consumer<List<String>> upperCaseConsumer = list -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i).toUpperCase());
			}
		};
// print a list of items into upper case strings
		Consumer<List<String>> prtConsumer = list -> list.stream().forEach(System.out::println);

		upperCaseConsumer.andThen(prtConsumer).accept(cities1);

		System.out.println("_______________________________________________________________-");

		/** Predicate -> represents a boolean valued function of an argument */
		List<String> predicate = Arrays.asList("USA", "India", "China", "Australia", "Japan", "Indonesia");
		Predicate<String> names = str -> str.startsWith("I");
		predicate.stream().filter(names).forEach(System.out::println);

		System.out.println("_______________________________________________________________-");
		
		/**Function -> take one argument and produce a result (SAM)*/
		List<String> func = Arrays.asList("USA", "India", "China", "Australia", "Japan", "Indonesia");
		Function<String,Integer> countryMap= String::length;
		List<Integer> countryLength=func.stream().map(countryMap).collect(Collectors.toList());
		System.out.println(countryLength);
		
		/**
		 * Java 8 Assignment Due Monday 8th, 2021
		 * Emp{id,name,age,gender,dept,yearofjoining,salary}
		 * Emp -> 111,"Loel",24,Male,CS,2010,2021,123456 
		 * 
		 * i) How many male and female employees are there?
		 * ii) Find out average age of male and female employees?
		 * iii) Find the highest paid employee in this employee class?
		 * iv) List all the names of employees who have joined after 2016?
		 * v)Find out most senior employee in this emp class?
		 * vi) Count the number of employees in each dept?
		 * vii) Find male and female employees are there in the CS dept and Mechanical dept?
		 * viii) Find the average salary of male and female employees?
		 * ix) Differentiate the employess who are younger or equal to 30yrs from those employees who are older than 25 yrs?
		 * x)List down the names of all employees in each dept?
		 *  
		 * */
		
	}

}