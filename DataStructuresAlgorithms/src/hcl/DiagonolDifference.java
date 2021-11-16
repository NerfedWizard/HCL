package hcl;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DiagonolDifference {

	/*
	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Finish this code for the 2 dimensional array
		for (List i : arr) {
			System.out.println(i.toString());
		}
		int j = arr.size() - 1;
		int diag1 = 0;
		int diag2 = 0;
		for (int i = 0; i < arr.size(); i++) {
			diag1 += arr.get(i).get(i);
			diag2 += arr.get(i).get(j);
			j -= 1;
		}
		int reslt = Math.abs(diag1 - diag2);
		return reslt;
		// Write your code here

	}

	public static void main(String[] args) {
		int row = 3;
		int col = 3;
		Random rand = new Random();
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		for (int i = 0; i < row; i++) {
			List<Integer> arrRow = new ArrayList<Integer>();
			for (int j = 0; j < col; j++) {
				int x = rand.nextInt(11);
				arrRow.add(x);
			}
			arr.add(arrRow);
		}
		System.out.println(diagonalDifference(arr));
	}

}