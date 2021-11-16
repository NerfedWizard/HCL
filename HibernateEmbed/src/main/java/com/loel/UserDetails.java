package com.loel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // making whole user objects as persistence
@Table(name = "user_details")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "USER_NAME")
	private String userName;
		
	@Embedded
	private Address address;  //HAS A

	public UserDetails(String userName, Address address) {
		super();
		this.userName = userName;
		this.address = address;
	}

}
