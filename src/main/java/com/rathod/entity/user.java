package com.rathod.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class user {
	
	@Id
	@Column(name="username")
	String username;
	@Column(name="password")
	String password;
	@Column(name="role")
	String role;
	
	public user()
	{
		
	}
	
	

	public user(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public user(String username, String password, String designation) {
		
		this.username = username;
		this.password = password;
		this.role = designation;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "user [username=" + username + ", password=" + password + ", designation=" + role + "]";
	}
	
	
	

}
