package com.day4;

import java.util.Scanner;

public class MainCard {
	static Card payback;
	static Card member;

	public static void main(String[] args) {
//		String holderName, cardNumber, expiryDate;
		int rating = 0;
		int points = 0;
		double total = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Card\nPayback press 1\nMembership press 2");
		int check = sc.nextInt();

		switch (check) {
		case 1:
			System.out.println("Enter the Card Details:");
			String[] temp = sc.next().split("|");
			System.out.println("Enter points in card:");
			points = sc.nextInt();
			System.out.println("Enter Amount");
			total = sc.nextDouble();
			payback = new PaybackCard(temp[0], temp[1], temp[2], points, total);
		case 2:
			System.out.println("Enter the Card Details:");
			String[] temp2 = sc.next().split("|");
			System.out.println("Enter the Rating:");
			rating = sc.nextInt();
			member = new MembershipCard(temp2[0], temp2[1], temp2[2], rating);
		}
		if (check == 1) {
			System.out.println(payback.getHolderName() + "Payback Card Details");
			System.out.println("Card Number " + payback.getCardNumber());
			System.out.println("Points Earned " + points);
		}

	}

}
