package hcl;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

//import hcl.SetExample.Employee;

public class SetExample {

	public static void main(String[] args) {
// TODO Auto-generated method stub
// Set of integers, Add value 1 2 3 4 2 5 3
// HashSet Example

//		Set<Integer> s = new HashSet<Integer>();
//		Integer[] data = { 3, 2, 3, 4, 2, 5, 1 };
//		List<Integer> data1 = Arrays.asList(data);
//		s.addAll(data1);
// s.forEach(System.out::println);
//		System.out.println(s); // Hash set output

// TODO Auto-generated method stub
// Set of integers, Add value 1 2 3 4 2 5 3
// TreeSet Example

//		TreeSet<Integer> s1 = new TreeSet<Integer>();
//		Integer[] data2 = { 3, 2, 3, 4, 2, 5, 1 };
//		List<Integer> data3 = Arrays.asList(data2);
//		s1.addAll(data3);
// s1.descendingSet(); Will return descending order
//		System.out.println(s1.descendingSet());

// TODO Auto-generated method stub
// Set of integers, Add value 1 2 3 4 2 5 3
// Override hashcode for distinct

//		Set<Employee> s2 = new HashSet<Employee>();
		SetExample se = new SetExample();
//		s2.add(se.new Employee("silvi", 35));
//		s2.add(se.new Employee("Loel", 100));
//		s2.add(se.new Employee("silvi", 35));

// s2.add(null);
//		System.out.println(s2);
//		System.out.println(s2.contains(se.new Employee("silvi", 35)));
//		System.out.println(s2.contains(se.new Employee("Jeenal", 35)));
// returns boolean, contains the search
// complexity o(1)

// Store the employees in a sorting order
//		Set<Employee> s3 = new TreeSet<Employee>();
//		TreeSet<Employee> nameComp = new TreeSet<Employee>(se.new NameCompare());
//		Set<Employee> hope = new HashSet<Employee>();
//		nameComp.add(se.new Employee("Leo", 55));
//		nameComp.add(se.new Employee("Loel", 55));
//		nameComp.add(se.new Employee("silvi", 100));
//		nameComp.add(se.new Employee("krishna", 35));
//		nameComp.add(se.new Employee("divyluv", 100));
//		System.out.println("\nUsing name compare: ");
//		for (Employee e : nameComp) {
//			hope.add(e);
//			System.out.println(e);
//		}
//		TreeSet<Employee> scoreComp = new TreeSet<Employee>(se.new ScoreCompare());
//		scoreComp.addAll(hope);
//		System.out.println("\nUsing score compare");
//		for (Employee e : scoreComp) {
//			System.out.println(e);
//
//		}
//		System.out.println();
//		PriorityQueue<Employee> q = new PriorityQueue<Employee>();
//		q.add(se.new Employee("Leo", 55));
//		q.add(se.new Employee("Loel", 55));
//		q.add(se.new Employee("silvi", 100));
//		q.add(se.new Employee("krishna", 35));
//		q.add(se.new Employee("divyluv", 100));
//
//		for (Employee e : q) {
//			System.out.println(e);
//		}
		System.out.println("\n");
		PriorityQueue<Employee> qe = new PriorityQueue<Employee>(se.new NameCompare());
		qe.offer(se.new Employee("Leo", 55));
		qe.offer(se.new Employee("Loel", 55));
		qe.offer(se.new Employee("silvi", 100));
		qe.offer(se.new Employee("krishna", 35));
		qe.offer(se.new Employee("divyluv", 100));
		System.out.println(qe.size());
		for (int i = 0; i < qe.size(); i++) {
			System.out.println(qe.poll());
		}
		for (Employee e : qe) {
			System.out.println(e);
		}
//		nameComp.retainAll(scoreComp);
//		System.out.println("******Trying Something********");
//		for (Employee e : nameComp) {
//			System.out.println(e);
//		}
		// This is for the new score comparator

// s2.add(null);
//		System.out.println(s3);
//		System.out.println(s3.contains(se.new Employee("silvi", 35)));
//		System.out.println(s3.contains(se.new Employee("Jeenal", 35)));

//Sort All Employees by scores from highest to lowest. If the scores are same sort by alphabetical order.
//Almost 5 different employees [leo 55, loel 55, silvi 100, krishna 35, divyluv 100]
//by treeset method. Output - [divyluv 100, silvi 100, leo 55, loel 55, krishna 35]

		/** Need to make the scores thing and get it going for the hunderth time */

	}

// create a new class

	class Employee implements Comparable<Object> {

		String name;
		Integer score;

		Employee(String name, int score) {
			this.name = name;
			this.score = score;

		}

		public String toString() {
			return name + " " + score;
		}

		@Override
		public boolean equals(Object obj) {

			Employee e = (Employee) obj;
			return this.name.equals(e.name);
		}

		@Override
		public int hashCode() {

			return this.name.hashCode() + this.score.hashCode();
		}

		public String getName() {
			return this.name;
		}

		public Integer getScore() {
			return this.score;
		}

		@Override
		public int compareTo(Object arg0) {

			Employee e = (Employee) arg0;
			return this.name.compareTo(e.name);
		}

	}

	class NameCompare implements Comparator<Employee> {

		@Override
		public int compare(Employee one, Employee two) {
			one.getScore().compareTo(two.getScore());
			return one.getName().compareTo(two.getName());
		}

	}

	class ScoreCompare implements Comparator<Employee> {

		@Override
		public int compare(Employee one, Employee two) {
			if (one.getScore() > two.getScore()) {
				return 1;
			} else {
				return -1;
			}
		}
	}

	/**
	 * Assumming that your class doesn't implement comparable how do you sort the
	 * objects using TreeSet - hint - use TreeSet constructor with comparator
	 * parameter
	 */
	class Employee1 {

		String name;
		Integer score;

		Employee1(String name, int score) {
			this.name = name;
			this.score = score;

		}

		public String toString() {
			return name + " " + score;
		}

		@Override
		public boolean equals(Object obj) {
// TODO Auto-generated method stub

			Employee e = (Employee) obj;
			return this.name.equals(e.name);
		}

		@Override
		public int hashCode() {
// TODO Override because its hashset
			return this.name.hashCode() + this.score.hashCode();
		}

	}
}