package hcl;

import java.text.DecimalFormat;

public class Result {
	public static void plusMinus(int[] arr) {

		DecimalFormat df = new DecimalFormat("#.00000");

		double zero = 0;
		double neg = 0;
		double pos = 0;

		for (int i : arr) {
			if (i == 0) {
				zero += 1;
			} else if (i < 0) {
				neg += 1;
			} else {
				pos += 1;
			}

		}
		double dPos = pos / arr.length;
		double dNeg = neg / arr.length;
		double dZero = zero / arr.length;

		System.out.println("Positive: " + df.format(dPos));
		System.out.println("Negative: " + df.format(dNeg));
		System.out.println("Zero: " + df.format(dZero));

	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 0 };
		plusMinus(arr);
	}
}
