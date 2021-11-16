/**
 * 
 */
package hcl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author loeln
 *
 */
public class CodingChallenges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("25 % 5 = " + 25 % 5);
//		System.out.println("26 % 5 = " + 26 % 5);
//		System.out.println("27 % 5 = " + 27 % 5);
//		System.out.println("28 % 5 = " + 28 % 5);
//		System.out.println("29 % 5 = " + 29 % 5);
/**
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(20);
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(33);
		grades.add(69);
		grades.add(63);
		grades.add(87);
		grades.add(28);
		grades.add(13);
		grades.add(99);
		grades.add(78);
		grades.add(57);
		grades.add(71);
		grades.add(102);
		grades.add(86);
		grades.add(62);
		grades.add(59);
		grades.add(74);
		grades.add(0);
		grades.add(40);
		List<Integer> graded = new ArrayList<Integer>();
		for (int i = 1; i < grades.size(); i++) {
			int oldGrade = grades.get(i);
			if (oldGrade % 5 >= 3 && oldGrade > 37) {
				int newGrade = oldGrade / 5 * 5 + 5;
				graded.add(newGrade);
				System.out.println("Old Grade: " + oldGrade + " New Grade: " + newGrade);
			} else {
				graded.add(grades.get(i));
			}
		}
		for (Integer i : graded) {
			System.out.println(i);
		}
*/
//		List<Integer> arr = new ArrayList<Integer>();
//		long[] total = new long[5];
//		arr.add(5);
//		arr.add(3);
//		arr.add(1);
//		arr.add(2);
//		arr.add(4);
//
//		for (int i = 0; i < arr.size(); i++) {
//			total[i] = arr.get(i);
//		}
//		System.out.println(total[0]);
//		Arrays.sort(total);
//		System.out.println(total[0]);
//
//		long min = 0;
//		long max = 0;
//
//		for (int i = 0; i < total.length - 1; i++) {
//			min += total[i];
//		}
//		for (int i = 1; i < total.length; i++) {
//			max += total[i];
//		}
//		System.out.println("min: " + min + " \nmax: " + max);
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		arr.add(4);
//		arr.add(5);
//		System.out.println(arr.toString());
//		for (Integer i : arr) {
//			System.out.println(i);
//		}
	}

}
