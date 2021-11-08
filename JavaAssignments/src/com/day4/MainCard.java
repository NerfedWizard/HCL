package com.day4;

import java.util.Scanner;
import java.util.regex.Pattern;

/** Question 3 Day 4 testing File for Card class and its  */
public class MainCard {
	static String holderName;
	static String cardNumber;
	static String expiryDate;
	static Card payback;
	static Card member;
	static int rating = 0;
	static int points = 0;
	static double total = 0;
	static Scanner sc;
	static String delim = Pattern.quote("|");

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Select the Card\nPayback press 1\nMembership press 2");
		int check = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Card Details:");
		String str = sc.nextLine();
		String[] temp = str.split(delim);
		holderName = temp[0];
		cardNumber = temp[1];
		expiryDate = temp[2];
		if (check == 1) {
			payback();
		} else if (check == 2) {
			member();
		}
		sc.close();
	}

	public static void payback() {
		System.out.println("Enter points in card:");
		points = sc.nextInt();
		System.out.println("Enter Amount");
		total = sc.nextDouble();
		payback = new PaybackCard(holderName, cardNumber, expiryDate, points, total);
		printDetails(1, payback);
	}

	public static void member() {
		System.out.println("Enter the Rating:");
		rating = sc.nextInt();
		member = new MembershipCard(holderName, cardNumber, expiryDate, rating);
		printDetails(2, member);
	}

	public static void printDetails(int check, Card card) {
		System.out.println(card.getHolderName() + " Payback Card Details");
		System.out.println("Card Number " + card.getCardNumber());
		if (check == 1) {
			System.out.println(card.getHolderName() + " Payback Card Details");
			System.out.println("Card Number " + card.getCardNumber());
			System.out.println("Points Earned " + points);
		} else if (check == 2) {
			System.out.println(card.getHolderName() + " Member Card Details");
			System.out.println("Card Number " + card.getCardNumber());
			System.out.println("Rating " + rating);
		}
	}
}