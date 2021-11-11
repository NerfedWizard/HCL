package com.loel.model2;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	// POJO
	private String userName;
	private String userPassword;

	// Business Logic
	public boolean validate() {
		if (userName.equals("admin") && userPassword.equals("123")) {
			return true;
		} else {
			return false;
		}
	}
}
