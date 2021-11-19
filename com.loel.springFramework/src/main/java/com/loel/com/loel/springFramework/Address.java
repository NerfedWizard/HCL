package com.loel.com.loel.springFramework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	private String city;
	private String state;
	private String country;

	void printAddr() {
		System.out.println("Name " + city + "\nState " + state + "\nCountry " + country);
	}
}
