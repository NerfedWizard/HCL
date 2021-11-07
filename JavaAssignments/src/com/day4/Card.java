package com.day4;

public abstract class Card {
	String holderName;
	String cardNumber;
	String expiryDate;

	public Card() {

	}

	public Card(String holderName, String cardNumber, String expiryDate) {
		this.holderName = holderName;
		this.cardNumber = cardNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
