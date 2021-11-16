package searchAgolrithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Takes the given arrays and finds the common elements in each and prints out
 * the new array
 */
public class Color {
	private static void FindCommonValue(String[] arr1, String[] arr2, String[] arr3) {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		Set<String> set3 = new HashSet<String>();
		for (String i : arr1) {
			set1.add(i);
		}
		for (String i : arr2) {
			set2.add(i);
		}
		for (String i : arr3) {
			set3.add(i);
		}
		set1.retainAll(set2);
		set1.retainAll(set3);
		System.out.println("Common Elements: " + set1);
	}

	public static void main(String[] args) {
		String list1[] = { "red", "blue", "orange", "green", "yellow" };
		String list2[] = { "red", "green", "orange", "green", "yellow" };
		String list3[] = { "red", "blue", "orange", "green", "blue" };

		for (String i : list1) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		for (String i : list2) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		for (String i : list3) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		FindCommonValue(list1, list2, list3);
	}
}
