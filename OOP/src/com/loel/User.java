package com.loel;

class Address {
	String city, state, country;

	Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

public class User {
	int userID;
	String userName;
	Address address;// Has A

	public User(int userID, String userName, Address address) {
		this.userID = userID;
		this.userName = userName;
		this.address = address;
	}

	void print() {
		System.out.println(userID + " " + userName);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address a1 = new Address("Sant Clara", "CA", "USA");
		Address a2 = new Address("Pittsburgh", "PA", "USA");
		Address a3 = new Address("Boston", "MA", "USA");

		User u1 = new User(101, "Nelson", a1);
		User u2 = new User(102, "Jaivir", a2);
		User u3 = new User(103, "JayDeep", a3);
		u1.print();
		u2.print();
		u3.print();
	}
}
