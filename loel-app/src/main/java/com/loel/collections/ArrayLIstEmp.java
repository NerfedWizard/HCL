package com.loel.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
class Emp implements Comparable<Emp> {
	private int empId;
	private String empName;
	private int empAge;

	@Override
	public int compareTo(Emp emp) {
		if (empAge == emp.empAge) {
			return 0;
		} else if (empAge > emp.empAge) {
			return 1;
		} else
			return -1;
	}
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Comparator<Product> {

	private int prdId;
	private String prdName;
	private int prdPrice;

	public int compare(Product o1, Product o2) {
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		if (p1.prdPrice == p2.prdPrice)
			return 0;
		else if (p1.prdPrice < p2.prdPrice)
			return 1;
		else
			return -1;

	}

}

public class ArrayLIstEmp {

//	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Emp e1 = new Emp(111, "Loel", 29);
		Emp e2 = new Emp(112, "Mac", 30);
		Emp e3 = new Emp(113, "Mani", 31);
		Emp e4 = new Emp(114, "Sashank", 32);
		Emp e5 = new Emp(115, "Justin", 22);

		List<Emp> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
//	        list.remove("Mac");
//		list.remove(3);
//	        list.removeIf(str-> str.)
//		list.forEach(System.out::println);
//		list.removeIf(str -> str.equals(e1));
		Collections.sort(list);
		for (Emp e : list) {
			System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.getEmpAge());
		}
		List<Product> list2 = new ArrayList<>();
		list2.add(new Product(111, "Laptop", 29));
		list2.add(new Product(112, "Desktop", 30));
		list2.add(new Product(113, "Mouse", 31));
		list2.add(new Product(114, "Pen", 32));
		list2.add(new Product(115, "Pencil", 22));
		Collections.sort(list2, new Product());
	}

}
